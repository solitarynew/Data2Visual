package org.example.transform;

import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.engine.compiler.AtlDefaultCompiler;
import org.eclipse.m2m.atl.engine.compiler.atl2010.Atl2010InPlace;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.HashMap;

public class AltToAsmConverter {
    public void convert(String atlFilePath) throws ATLCoreException, IOException, URISyntaxException {
        AtlDefaultCompiler compiler = new Atl2010InPlace();
        File atlFile = new File(atlFilePath);
        String asmFilePath = atlFilePath.replace(".atl", ".asm");
        InputStream altInputStream = new FileInputStream(atlFile);
        compiler.compile(altInputStream, asmFilePath);
    }
}
