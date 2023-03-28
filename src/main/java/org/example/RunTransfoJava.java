package org.example;

import View.ViewPackage;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.example.transform.Transformation;
import org.example.transform.TransformationFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
                "Transformations/GraphQL2View.asm", "GraphQL", "View"
        );

        XMIParser.INSTANCE.registry("http://www.example.org/View", ViewPackage.eINSTANCE);
        EList<EObject> eObjects = XMIParser.INSTANCE.parse("Models/View.xmi");

        Object res1 = TransformationFactory.INSTANCE
                .getTransformation(TransformationFactory.TransformationType.View2AntDesignProTransformation)
                .transform(eObjects);
        System.out.println(((Map) res1).get("BidSecurity"));

        Transformation transformation = TransformationFactory.INSTANCE
                .getTransformation(TransformationFactory.TransformationType.Schema2GraphQLTransformation);
        // 读取resource文件夹下的文件
        String schema = new String(RunTransfoJava.class.getResourceAsStream("/type.graphql").readAllBytes(), StandardCharsets.UTF_8);
        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schema);
        EList<EObject> res2 = transformation.transform(typeDefinitionRegistry);
        XMIParser.INSTANCE.save("c.xmi", res2);
    }

}