package org.example;


import GraphQL.Attribute;
import GraphQL.ObjectType;
import GraphQL.Schema;
import GraphQL.impl.GraphQLFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.IOException;

public class XMIParser {

    public static XMIParser INSTANCE = new XMIParser();

    private final ResourceSet resourceSet;

    public XMIParser() {
        this.resourceSet = new ResourceSetImpl();
        this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
                put("xmi", new XMIResourceFactoryImpl());
    }

    public void registry(String nsURI, EPackage ePackage) {
        resourceSet.getPackageRegistry().put(nsURI, ePackage);
    }

    public EList<EObject> parse(String path) {
        Resource resource = resourceSet.createResource(URI.createURI(path));
        try {
            resource.load(null);
            return resource.getContents();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void save(String path, EList<EObject> eObjects) {
        Resource resource = resourceSet.createResource(URI.createURI(path));
        resource.getContents().addAll(eObjects);
        try {
            resource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parseTest(String path) throws IOException {
        // parse the xmi file
//        ResourceSet resourceSet = new ResourceSetImpl();
//        Map<String, Object> extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
//        extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl());
//        EPackage.Registry packageRegistry = resourceSet.getPackageRegistry();
//        Resource resource = resourceSet.createResource(URI.createFileURI(path));
//        resource.load(null);
        Schema schema = GraphQLFactoryImpl.eINSTANCE.createSchema();
        ObjectType objectType = GraphQLFactoryImpl.eINSTANCE.createObjectType();
        objectType.setName("test");
        Attribute attribute = GraphQLFactoryImpl.eINSTANCE.createAttribute();
        attribute.setName("attr1");
        attribute.setTypeName("String");
        objectType.getAttribute().add(attribute);
        schema.getType().add(objectType);
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
        //resourceSet.getPackageRegistry().put("http://www.example.org/View", View.ViewPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put("http://www.example.org/View", View.ViewPackage.eINSTANCE);

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
