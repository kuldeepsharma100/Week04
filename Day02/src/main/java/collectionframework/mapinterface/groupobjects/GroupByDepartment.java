package collectionframework.mapinterface.groupobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByDepartment {
    public static Map<String, List<Employees>> groupByDepartment(List<Employees> employees) {
        Map<String, List<Employees>> groupedMap = new HashMap<>();

        for (Employees emp : employees) {
            // If department is not in the map, add a new list
            groupedMap.putIfAbsent(emp.department, new ArrayList<>());
            // Add the employee to the department list
            groupedMap.get(emp.department).add(emp);
        }

        return groupedMap;
    }

}
