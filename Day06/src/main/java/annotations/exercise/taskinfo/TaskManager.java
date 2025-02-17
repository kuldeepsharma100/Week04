package annotations.exercise.taskinfo;

public class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Task completed.");
    }

    @TaskInfo(priority = 2, assignedTo = "Bob")
    public void reviewTask() {
        System.out.println("Task reviewed.");
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.completeTask();
        taskManager.reviewTask();
    }
}
