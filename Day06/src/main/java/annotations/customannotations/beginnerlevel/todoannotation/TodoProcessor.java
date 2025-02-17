package annotations.customannotations.beginnerlevel.todoannotation;

import java.lang.reflect.Method;

public class TodoProcessor {
    public static void main(String[] args) {
        try {
            Class<?> cls = Project.class;

            System.out.println("Pending Tasks:");

            // Loop through all methods
            for (Method method : cls.getDeclaredMethods()) {
                // Check if @Todo annotation is present
                if (method.isAnnotationPresent(Todo.class)) {
                    Todo todo = method.getAnnotation(Todo.class);
                    System.out.println("Method: " + method.getName());
                    System.out.println("Task: " + todo.task());
                    System.out.println("Assigned To: " + todo.assignedTo());
                    System.out.println("Priority: " + todo.priority());
                    System.out.println("------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
