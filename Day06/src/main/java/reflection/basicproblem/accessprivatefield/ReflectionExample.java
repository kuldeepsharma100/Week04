package reflection.basicproblem.accessprivatefield;
import java.lang.reflect.*;


public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Load the Person class
            Class<?> clazz = Person.class;

            // Create an instance of Person
            Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);
            Object personInstance = constructor.newInstance(25);

            // Get the private field 'age'
            Field ageField = clazz.getDeclaredField("age");
            ageField.setAccessible(true);

            // Get and print initial age
            System.out.println("Initial Age: " + ageField.get(personInstance));

            // Modify age field
            ageField.set(personInstance, 30);
            System.out.println("Modified Age: " + ageField.get(personInstance));

            // Invoke displayAge method
            Method displayMethod = clazz.getDeclaredMethod("displayAge");
            displayMethod.invoke(personInstance);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
