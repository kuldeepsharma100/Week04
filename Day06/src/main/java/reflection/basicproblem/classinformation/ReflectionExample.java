package reflection.basicproblem.classinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the class name: ");
        String className = sc.nextLine();

        try {
            // Load the class dynamically
            Class<?> clazz = Class.forName(className);

            // Display class name
            System.out.println("Class Name: " + clazz.getName());

            // Display constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            // Display fields
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            // Display methods
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}