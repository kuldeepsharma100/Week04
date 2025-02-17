package reflection.intermediate.customannotation;

import java.lang.annotation.Annotation;

public class AnnotationExample {
    public static void main(String[] args) {
        try {
            // Get the class object for MyClass
            Class<?> cls = MyClass.class;

            // Check if the Author annotation is present on the class
            if (cls.isAnnotationPresent(Author.class)) {
                // Retrieve the Author annotation
                Author author = cls.getAnnotation(Author.class);

                // Display the value of the name element in the annotation
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No Author annotation found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
