package collectionframework.mapinterface.groupobjects;

public class Employees {
    String name;
    String department;

    public Employees(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name; // Display only the name in output
    }
}
