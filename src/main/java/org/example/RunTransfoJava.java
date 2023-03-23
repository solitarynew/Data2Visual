package org.example;

import View.ViewFactory;
import View.ViewPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.example.transfrom.TransformationFactory;

import java.io.IOException;
import java.util.Map;

public class RunTransfoJava {

    public static void main(String[] args) throws IOException {
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
                "Transformations/graphql2view.asm", "GraphQL", "View"
        );

        XMIParser.INSTANCE.registry("http://www.example.org/View", ViewPackage.eINSTANCE);
        EList<EObject> eObjects = XMIParser.INSTANCE.parse("Models/View.xmi");

        Object view2AntDesignProTransformation = TransformationFactory.INSTANCE.getTransformation("View2AntDesignProTransformation").transform(eObjects);
        System.out.println(((Map)view2AntDesignProTransformation).get("BidSecurity"));
    }

}