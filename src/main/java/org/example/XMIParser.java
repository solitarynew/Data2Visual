package org.example;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import java.io.IOException;

public class XMIParser {
    public static void parse(String path) throws IOException {
        // parse the xmi file
        XMIResourceFactoryImpl resourceFactory = new XMIResourceFactoryImpl();
        Resource resource = resourceFactory.createResource(URI.createURI(path));
        resource.load(null);

    }
}
