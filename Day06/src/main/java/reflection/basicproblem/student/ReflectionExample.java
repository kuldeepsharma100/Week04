package reflection.basicproblem.student;

import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Load the Student class
            Class<?> clazz = Student.class;

            // Create an instance of Student using Reflection
            Object studentInstance = clazz.getDeclaredConstructor().newInstance();

            // Invoke the display method
            Method displayMethod = clazz.getDeclaredMethod("display");
            displayMethod.invoke(studentInstance);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
