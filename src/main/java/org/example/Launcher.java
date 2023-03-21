package org.example;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.core.*;
import org.eclipse.m2m.atl.core.emf.*;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class Launcher {

    public void lunch(String inputMetaModel, String outputMetaModel, String inputModel, String outputModel, String altFilePath) {
        try {
            /*
             * Initializations
             */
            ILauncher transformationLauncher = new EMFVMLauncher();
            ModelFactory modelFactory = new EMFModelFactory();
            IInjector injector = new EMFInjector();
            IExtractor extractor = new EMFExtractor();

            /*
             * Load metamodels
             */
            IReferenceModel companyMetamodel = modelFactory.newReferenceModel();
            injector.inject(companyMetamodel, inputMetaModel);
            IReferenceModel totalMetamodel = modelFactory.newReferenceModel();
            injector.inject(totalMetamodel, outputMetaModel);

            /*
             * Run "Cut" transformation
             */
            IModel companyModel = modelFactory.newModel(companyMetamodel);
            injector.inject(companyModel, inputModel);

            /*
             * Run "ComputeTotal" transformation
             */
            IModel companyModel_Total = modelFactory.newModel(totalMetamodel);

            transformationLauncher.initialize(new HashMap<String,Object>());
            transformationLauncher.addInModel(companyModel, "IN", "GraphQL");
            transformationLauncher.addOutModel(companyModel_Total, "OUT", "View");
            transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String,Object>(),
                    new FileInputStream(altFilePath));

            extractor.extract(companyModel_Total, outputModel);

            /*
             * Unload all models and metamodels (EMF-specific)
             */
            EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
            emfModelFactory.unload((EMFModel) companyModel_Total);
            emfModelFactory.unload((EMFReferenceModel) companyMetamodel);
            emfModelFactory.unload((EMFReferenceModel) totalMetamodel);

        } catch (ATLCoreException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
