package junit.basicjunittest.timeouttesting;

public class TaskUtils {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);  // Sleep for 3 seconds
        return "Task Completed";
    }

    // Main method to manually test the longRunningTask method
    public static void main(String[] args) {
        TaskUtils taskUtils = new TaskUtils();
        try {
            System.out.println("Running the long-running task...");
            String result = taskUtils.longRunningTask();
            System.out.println(result);  // Should print "Task Completed" after 3 seconds
        } catch (InterruptedException e) {
            System.out.println("Task was interrupted");
        }
    }
}
