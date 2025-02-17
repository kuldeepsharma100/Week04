package reflection.advanceproblem.methodexecutiontiming;

import java.lang.reflect.Method;

public class MethodTimer {
    public static void executeWithTiming(Object obj, String methodName) {
        try {
            // Get the method by name
            Method method = obj.getClass().getMethod(methodName);

            // Measure start time
            long startTime = System.nanoTime();

            // Invoke the method dynamically
            method.invoke(obj);

            // Measure end time
            long endTime = System.nanoTime();

            // Calculate and print execution time in milliseconds
            System.out.println("Execution time of " + methodName + ": " + (endTime - startTime) / 1_000_000.0 + " ms");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
