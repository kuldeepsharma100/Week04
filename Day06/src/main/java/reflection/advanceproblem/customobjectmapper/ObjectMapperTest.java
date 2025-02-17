package reflection.advanceproblem.customobjectmapper;

import java.util.HashMap;
import java.util.Map;

 class Person {
    private String name;
    private int age;

    // Getters and setters (optional, but good practice)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ObjectMapperTest {
    public static void main(String[] args) {
        // Create a map of properties to be mapped to the Person object
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "John Doe");
        properties.put("age", 30);

        // Use ObjectMapper to map the properties to a new Person object
        Person person = ObjectMapper.toObject(Person.class, properties);

        // Print the Person object
        System.out.println(person);
    }
}
