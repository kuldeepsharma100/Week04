package reflection.intermediate.privatestaticfield;

import java.lang.reflect.Field;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Get the Configuration class
            Class<?> cls = Configuration.class;

            // Access the private static field API_KEY
            Field apiKeyField = cls.getDeclaredField("API_KEY");

            // Make the field accessible (bypass the private modifier)
            apiKeyField.setAccessible(true);

            // Modify the value of the private static field
            apiKeyField.set(null, "ModifiedAPIKey98765"); // Passing null because it's a static field

            // Print the modified value using the static method
            Configuration.printApiKey();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
