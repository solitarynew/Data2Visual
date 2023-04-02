package org.example.transform;

import GraphQL.ObjectType;
import GraphQL.Schema;
import GraphQL.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.example.transform.util.FreeMarkerTool;

import java.util.HashMap;
import java.util.Map;

public class GraphQL2QueryOrMutationTransformation implements Transformation{

    @Override
    public Object transform(EList<EObject> o, Map<String, Object> options) {
        Map<String, String> map = new HashMap<>();
        for (EObject eObject : o) {
            if(!(eObject instanceof Schema)) {
                throw new IllegalArgumentException("Source Model is not a Schema");
            }
            Schema schema = (Schema) eObject;
            for (Type type : schema.getType()) {
                if (!(type instanceof ObjectType)) {
                    continue;
                }
                ObjectType objectType = (ObjectType) type;
                String s = FreeMarkerTool.INSTANCE.render((String) options.get("template"), objectType);
                map.put(objectType.getName(), s);
            }
        }
        return map;
    }

}
