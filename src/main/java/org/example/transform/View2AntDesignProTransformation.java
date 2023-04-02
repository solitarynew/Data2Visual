package org.example.transform;

import View.Item;
import View.Schema;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class View2AntDesignProTransformation implements Transformation{



    public View2AntDesignProTransformation() {
        // set defaultFromItemPros
        JsonArray rules = new JsonArray();
        JsonObject rule = new JsonObject();
        rule.addProperty("required", true);
        rule.addProperty("message", "必填");
        rules.add(rule);
        defaultFromItemPros.add("rules", rules);
        // set defaultProps
        defaultColProps.addProperty("xs", 24);
        defaultColProps.addProperty("md", 12);
    }

    private enum ValueType {
        TEXT("text"),
        DATETIME("dateTime"),
        DIGIT("digit"),
        SWITCH("switch");

        private String value;

        ValueType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static ValueType fromViewType(String viewType) {
           return TEXT;
        }
    }

    private static final String TITLE = "title";
    private static final String DATA_INDEX = "dataIndex";
    private static final String VALUE_TYPE = "valueType";
    private static final String FROM_ITEM_PROPS = "fromItemPros";
    private static final String WIDTH = "width";
    private static final String COL_PROPS = "colProps";


    private final JsonObject defaultFromItemPros = new JsonObject();
    private final String defaultWidth = "md";
    private final JsonObject defaultColProps = new JsonObject();

    private final List<String> IgnoreFields = List.of("_id");

    @Override
    public Map<String, Pair<JsonArray, JsonArray>> transform(EList<EObject> o, Map<String, Object> options) {
        Map<String, Pair<JsonArray, JsonArray>> map = new HashMap<>();
        for (EObject eObject : o) {
            if (eObject instanceof Schema) {
                Schema schema = (Schema) eObject;
                JsonArray mutationJsonArray = new JsonArray();
                JsonArray queryJsonArray = new JsonArray();
                EList<Item> items = schema.getItems();
                for (Item item : items) {
                    if (IgnoreFields.contains(item.getName())) {
                        continue;
                    }
                    JsonObject mutationJsonObject = new JsonObject();
                    mutationJsonObject.addProperty(TITLE, item.getName());
                    mutationJsonObject.addProperty(DATA_INDEX, item.getName());
                    mutationJsonObject.addProperty(VALUE_TYPE, ValueType.fromViewType(item.getType()).getValue());
                    mutationJsonObject.add(FROM_ITEM_PROPS, defaultFromItemPros);
                    mutationJsonObject.addProperty(WIDTH, defaultWidth);
                    mutationJsonObject.add(COL_PROPS, defaultColProps);
                    mutationJsonArray.add(mutationJsonObject);

                    JsonObject queryJsonObject = new JsonObject();
                    queryJsonObject.addProperty(TITLE, item.getName());
                    JsonArray dataIndex = new JsonArray();
                    dataIndex.add(schema.getName());
                    dataIndex.add("0");
                    dataIndex.add(item.getName());
                    queryJsonObject.add(DATA_INDEX, dataIndex);
                    queryJsonObject.addProperty(VALUE_TYPE, ValueType.fromViewType(item.getType()).getValue());
                    queryJsonObject.add(FROM_ITEM_PROPS, defaultFromItemPros);
                    queryJsonObject.addProperty(WIDTH, defaultWidth);
                    queryJsonObject.add(COL_PROPS, defaultColProps);
                    queryJsonArray.add(queryJsonObject);
                }
                map.put(schema.getName(), Pair.of(mutationJsonArray, queryJsonArray));
            }
        }
        return map;

    }
}
