package annotations.customannotations.beginnerlevel.todoannotation;

public class Project {

    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void userAuthentication() {
        System.out.println("User authentication pending...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDatabase() {
        System.out.println("Database optimization pending...");
    }

    @Todo(task = "Add logging to API endpoints", assignedTo = "Charlie", priority = "LOW")
    public void addLogging() {
        System.out.println("Logging implementation pending...");
    }

    public static void main(String[] args) {
        Project project = new Project();
        project.userAuthentication();
        project.optimizeDatabase();
        project.addLogging();
    }
}
