package annotations.exercise.taskinfo;

import java.lang.reflect.Method;

public class TaskProcessor {
    public static void main(String[] args) {
        try {
            Class<?> cls = TaskManager.class;

            // Loop through all methods
            for (Method method : cls.getDeclaredMethods()) {
                // Check if the annotation is present on the method
                if (method.isAnnotationPresent(TaskInfo.class)) {
                    TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                    System.out.println("Method: " + method.getName());
                    System.out.println("Priority: " + taskInfo.priority());
                    System.out.println("Assigned To: " + taskInfo.assignedTo());
                    System.out.println("------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
