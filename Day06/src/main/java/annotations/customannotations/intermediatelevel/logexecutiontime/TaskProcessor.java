package annotations.customannotations.intermediatelevel.logexecutiontime;

public class TaskProcessor {

    @LogExecutionTime
    public void fastTask() {
        System.out.println("Executing fast task...");
    }

    @LogExecutionTime
    public void slowTask() {
        System.out.println("Executing slow task...");
        try {
            Thread.sleep(500);  // Simulate slow task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void normalTask() {
        System.out.println("Executing normal task...");
    }

    public static void main(String[] args) {
        TaskProcessor processor = new TaskProcessor();

        // Measure execution time of annotated methods
        ExecutionTimeLogger.measureExecutionTime(processor, "fastTask");
        ExecutionTimeLogger.measureExecutionTime(processor, "slowTask");
        ExecutionTimeLogger.measureExecutionTime(processor, "normalTask");  // Not annotated
    }
}
