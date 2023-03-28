/*******************************************************************************
 * Copyright (c) 2010 INRIA and other.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *    INRIA - initial API and implementation
 *    Salvador Martinez Perez
 *******************************************************************************/
package org.example.transform.compiler;

import java.net.URL;


/**
 * 复制org.eclipse.m2m.atl.engine.compiler.atl2010.Atl2010InPlace的实现，更改了resource path
 *
 * The 2010 in-place version of the ATL compiler.
 *
 * @author <a href="mailto:Salvador.Martinez_Perez@inria.fr">Salvador Martinez Perez</a>
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 *
 */
public class Atl2010InPlace extends AtlDefaultCompiler {

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.m2m.atl.engine.compiler.AtlDefaultCompiler#getCodegeneratorURL()
     */
    protected URL getCodegeneratorURL() {
        return org.eclipse.m2m.atl.engine.compiler.atl2010.Atl2010InPlace.class.getResource("/compiler/ATLToASMCompiler.asm");
    }

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.m2m.atl.engine.compiler.AtlDefaultCompiler#getSemanticAnalyzerURL()
     */
    protected URL getSemanticAnalyzerURL() {
        return org.eclipse.m2m.atl.engine.compiler.atl2010.Atl2010InPlace.class.getResource("/compiler/ATL-WFR.asm");
    }

}
