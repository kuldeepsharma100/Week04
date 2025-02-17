package filehandling.serialization;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Kuldeep", "HR", 50000));
        employees.add(new Employee(102, "harsh", "IT", 60000));
        employees.add(new Employee(103, "Naman", "Finance", 55000));

        // Serialize Employee List
        EmployeeSerialization.serializeEmployees(employees);

        // Deserialize Employee List
        List<Employee> deserializedEmployees = EmployeeSerialization.deserializeEmployees();
        if (deserializedEmployees != null) {
            System.out.println("Deserialized Employee List:");
            for (Employee emp : deserializedEmployees) {
                System.out.println(emp);
            }
        }
    }

}
