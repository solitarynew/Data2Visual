package org.example.transform;

import View.Item;
import View.Schema;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import java.util.HashMap;
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


    @Override
    public Map<String, JsonArray> transform(EList<EObject> o) {
        Map<String, JsonArray> map = new HashMap<>();
        for (EObject eObject : o) {
            if (eObject instanceof Schema) {
                Schema schema = (Schema) eObject;
                JsonArray jsonArray = new JsonArray();
                EList<Item> items = schema.getItems();
                for (Item item : items) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty(TITLE, item.getName());
                    jsonObject.addProperty(DATA_INDEX, item.getName());
                    jsonObject.addProperty(VALUE_TYPE, ValueType.fromViewType(item.getType()).getValue());
                    jsonObject.add(FROM_ITEM_PROPS, defaultFromItemPros);
                    jsonObject.addProperty(WIDTH, defaultWidth);
                    jsonObject.add(COL_PROPS, defaultColProps);
                    jsonArray.add(jsonObject);
                }
                map.put(schema.getName(), jsonArray);
            }
        }
        return map;

    }
}
