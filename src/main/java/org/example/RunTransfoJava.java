package org.example;

import java.io.IOException;

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

        XMIParser.parse("Models/View.xmi");
    }

}