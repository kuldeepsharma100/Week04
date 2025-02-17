package annotations.customannotations.intermediatelevel.logexecutiontime;

import java.lang.reflect.Method;

public class ExecutionTimeLogger {
    public static void measureExecutionTime(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();  // Start time

                method.invoke(obj);  // Invoke the method

                long endTime = System.nanoTime();  // End time

                System.out.println("Execution time of " + methodName + ": " + (endTime - startTime) / 1_000_000.0 + " ms");
            } else {
                System.out.println("Method " + methodName + " is not annotated with @LogExecutionTime.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
