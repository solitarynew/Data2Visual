package org.example;


import GraphQL.Attribute;
import GraphQL.Schema;
import GraphQL.SystemType;
import GraphQL.Type;
import GraphQL.impl.GraphQLFactoryImpl;
import GraphQL.impl.TypeImpl;
import View.ViewFactory;
import View.impl.ViewFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.IOException;

public class XMIParser {
    public static void parse(String path) throws IOException {
        // parse the xmi file
//        ResourceSet resourceSet = new ResourceSetImpl();
//        Map<String, Object> extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
//        extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl());
//        EPackage.Registry packageRegistry = resourceSet.getPackageRegistry();
//        Resource resource = resourceSet.createResource(URI.createFileURI(path));
//        resource.load(null);
        Schema schema = GraphQLFactoryImpl.eINSTANCE.createSchema();
        SystemType systemType = GraphQLFactoryImpl.eINSTANCE.createSystemType();
        systemType.setName("test");
        Attribute attribute = GraphQLFactoryImpl.eINSTANCE.createAttribute();
        attribute.setName("attr1");
        attribute.setTypeName("String");
        systemType.getAttribute().add(attribute);
        schema.getType().add(systemType);
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
                put("xmi", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("a.xmi");
        Resource resource = resourceSet.createResource(uri);
        // reference attribute 的containment设置为true，才会将其连接的对象也存储到resource中
        // 其次，如果不设置containment，alt转化生成的xmi文件中，根元素为XMI，而不是写入的根元素，且每个元素时层级并行的
        // 通过"/1 /2"类似的格式，去索引对应的元素，但是这样的话，load时，无法成功索引多个元素从而会报错，只有"/1"这样单个元素的索引才能成功
        resource.getContents().add(schema);
        try
        {
            resource.save(null);
            System.out.println("saved");
        }
        catch (IOException e)
        {
            System.out.println("failed to write " + uri);
        }

        // print the contents of the xmi file
        Resource resource2 = resourceSet.createResource(URI.createURI("Models/GraphQL.xmi"));
        try {
            resource2.load(null);
            Schema schema2 = (Schema) resource2.getContents().get(0);
            System.out.println(schema2.getType().get(0).getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        URIConverter uriConverter = resourceSet.getURIConverter();
//        uriConverter.getURIMap()
//                .put(URI.createURI("http://www.example.org/View"), URI.createURI("Models/View.ecore"));

//        View.Schema schema3 = ViewFactoryImpl.eINSTANCE.createSchema();
//        View.Item item = ViewFactoryImpl.eINSTANCE.createItem();
//        item.setName("test");
//        schema3.getItems().add(item);
//        Resource resource3 = resourceSet.createResource(URI.createURI("b.xmi"));
//        resource3.getContents().add(schema3);
//        try
//        {
//            resource3.save(null);
//            System.out.println("saved");
//        }
//        catch (IOException e)
//        {
//            System.out.println("failed to write " + uri);
//            e.printStackTrace();
//        }

        // 存了一遍可以读取，因为uri自动注册了

        // 手动注册uri
        resourceSet.getPackageRegistry().put("http://www.example.org/View", View.ViewPackage.eINSTANCE);

        Resource resource4 = resourceSet.createResource(URI.createURI("Models/View.xmi"));
        try {
            resource4.load(null);
            View.Schema schema4 = (View.Schema) resource4.getContents().get(0);
            System.out.println(schema4.getItems().get(0).getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
