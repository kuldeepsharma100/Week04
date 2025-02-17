package reflection.advanceproblem.jsonrepresentation;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }

        StringBuilder json = new StringBuilder("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            field.setAccessible(true); // Allow access to private fields
            try {
                if (!firstField) {
                    json.append(", ");
                }
                firstField = false;

                String fieldName = field.getName();
                Object fieldValue = field.get(obj);

                json.append("\"").append(fieldName).append("\": ");

                if (fieldValue instanceof String) {
                    json.append("\"").append(fieldValue).append("\"");
                } else {
                    json.append(fieldValue);
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }
}
