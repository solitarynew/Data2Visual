package org.example.transform;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface Transformation {

    default EList<EObject> transform(Object o) {
        throw new UnsupportedOperationException("Not supported transform from Other Model to Ecore Model");
    }

    default Object transform(EList<EObject> o) {
        throw new UnsupportedOperationException("Not supported transform from Ecore Model to Other Model");
    }
}
