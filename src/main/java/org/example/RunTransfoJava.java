package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import org.eclipse.emf.ecore.util.EcoreUtil;

public class RunTransfoJava {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
//        launcher.lunch(
//                "MetaModels/company.ecore",
//                "MetaModels/total.ecore",
//                "Models/sampleCompany.xmi",
//                "Models/Java/sampleCompany_Total.xmi",
//                "Transformations/computeTotal.asm"
//        );
        launcher.lunch(
                "MetaModels/GraphQL.ecore",
                "MetaModels/View.ecore",
                "Models/GraphQL.xmi",
                "Models/View.xmi",
                "Transformations/graphql2view.asm"
        );
    }

}