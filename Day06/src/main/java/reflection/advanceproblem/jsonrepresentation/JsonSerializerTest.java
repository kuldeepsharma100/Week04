package reflection.advanceproblem.jsonrepresentation;

public class JsonSerializerTest {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, true);
        String json = JsonSerializer.toJson(person);
        System.out.println(json);
    }
}
