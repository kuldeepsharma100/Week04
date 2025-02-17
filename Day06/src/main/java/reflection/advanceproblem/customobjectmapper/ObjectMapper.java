package reflection.advanceproblem.customobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create a new instance of the class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterate through the properties map
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                // Get the field by name
                Field field = clazz.getDeclaredField(fieldName);

                // Make the field accessible (in case it's private)
                field.setAccessible(true);

                // Set the field value on the instance
                field.set(instance, fieldValue);
            }

            return instance;

        } catch (Exception e) {
            e.printStackTrace();
            return null; // Return null in case of an error
        }
    }
}
