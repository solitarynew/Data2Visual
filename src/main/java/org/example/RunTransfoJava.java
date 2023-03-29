package org.example;

import View.ViewPackage;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.example.transform.compiler.AltToAsmConverter;
import org.example.transform.Transformation;
import org.example.transform.TransformationFactory;
import org.neo4j.graphql.SchemaBuilder;
import org.neo4j.graphql.SchemaConfig;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
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

//        AtlCompiler.getCompiler("atl2010")
//                .compile(new FileInputStream("Transformations/GraphQL2View.atl"), "Transformations/GraphQL2View.asm");

        try {
            AltToAsmConverter.INSTANCE.convert("Transformations/GraphQL2View.atl");
        } catch (Exception e) {
            e.printStackTrace();
        }

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
//        String schema = new String(RunTransfoJava.class.getResourceAsStream("/type.graphql").readAllBytes(), StandardCharsets.UTF_8);
//        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schema);
//        SchemaBuilder schemaBuilder = new SchemaBuilder(typeDefinitionRegistry, new SchemaConfig(
//                new SchemaConfig.CRUDConfig(),
//                new SchemaConfig.CRUDConfig(true, List.of()),
//                false, true, SchemaConfig.InputStyle.INPUT_TYPE, true, true));
//        schemaBuilder.augmentTypes();
//
//        EList<EObject> res2 = transformation.transform(typeDefinitionRegistry);
//        XMIParser.INSTANCE.save("c.xmi", res2);
    }


    public static void main1(String[] args) throws IOException {
        String schema = new String(RunTransfoJava.class.getResourceAsStream("/type.graphql").readAllBytes(), StandardCharsets.UTF_8);
        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schema);
        EList<EObject> eObjects = TransformationFactory.INSTANCE
                .getTransformation(TransformationFactory.TransformationType.Schema2GraphQLTransformation)
                .transform(typeDefinitionRegistry);
        XMIParser.INSTANCE.save("c.xmi", eObjects);
    }


}