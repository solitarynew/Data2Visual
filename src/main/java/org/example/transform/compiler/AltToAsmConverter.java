package org.example.transform.compiler;

import org.eclipse.m2m.atl.core.ATLCoreException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;

public class AltToAsmConverter {

    static public AltToAsmConverter INSTANCE = new AltToAsmConverter();

    private final AtlDefaultCompiler compiler = new Atl2010InPlace();

    public void convert(String atlFilePath) throws ATLCoreException, IOException, URISyntaxException {
        String asmFilePath = atlFilePath.replace(".atl", ".asm");
        convert(atlFilePath, asmFilePath);
    }

    public void convert(String atlFilePath, String asmFilePath) throws ATLCoreException, IOException, URISyntaxException {
        File atlFile = new File(atlFilePath);
        compiler.compile(new FileInputStream(atlFile), asmFilePath);
    }
}
