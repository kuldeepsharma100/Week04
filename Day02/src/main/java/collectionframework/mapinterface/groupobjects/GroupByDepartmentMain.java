package collectionframework.mapinterface.groupobjects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GroupByDepartmentMain {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("Alice", "HR"),
                new Employees("Bob", "IT"),
                new Employees("Carol", "HR"),
                new Employees("David", "IT"),
                new Employees("Eve", "Finance")
        );

        Map<String, List<Employees>> groupedEmployees = GroupByDepartment.groupByDepartment(employees);

        // Display the grouped employees
        for (Map.Entry<String, List<Employees>> entry : groupedEmployees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
