package org.example.transfrom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface Transformation {
    Object transform(EList<EObject> o);
}
