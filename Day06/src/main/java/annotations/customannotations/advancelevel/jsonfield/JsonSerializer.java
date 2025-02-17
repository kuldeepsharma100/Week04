package annotations.customannotations.advancelevel.jsonfield;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {

    public static String serialize(Object obj) {
        try {
            Class<?> clazz = obj.getClass();
            Map<String, String> jsonMap = new HashMap<>();

            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);  // Allow access to private fields

                if (field.isAnnotationPresent(JsonField.class)) {
                    JsonField jsonField = field.getAnnotation(JsonField.class);
                    String jsonKey = jsonField.name();
                    Object value = field.get(obj);

                    jsonMap.put(jsonKey, value.toString());
                }
            }

            return mapToJson(jsonMap);
        } catch (Exception e) {
            throw new RuntimeException("Serialization failed: " + e.getMessage());
        }
    }

    private static String mapToJson(Map<String, String> map) {
        StringBuilder json = new StringBuilder("{");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            json.append("\"").append(entry.getKey()).append("\": \"")
                    .append(entry.getValue()).append("\", ");
        }
        if (json.length() > 1) {
            json.setLength(json.length() - 2);  // Remove trailing comma
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {
        User user = new User("Alice", 25, "alice@example.com");
        String json = serialize(user);
        System.out.println(json);
    }
}
