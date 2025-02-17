package annotations.customannotations.beginnerlevel.importantmethod;

import java.lang.reflect.Method;

public class ImportantMethodProcessor {
    public static void main(String[] args) {
        try {
            Class<?> cls = Application.class;

            // Loop through all methods
            for (Method method : cls.getDeclaredMethods()) {
                // Check if @ImportantMethod annotation is present
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                    System.out.println("Method: " + method.getName() + ", Importance Level: " + annotation.level());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
