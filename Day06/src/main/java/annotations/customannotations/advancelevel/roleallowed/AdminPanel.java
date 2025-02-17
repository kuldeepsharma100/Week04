package annotations.customannotations.advancelevel.roleallowed;

public class AdminPanel {

    @RoleAllowed("ADMIN")  // Only ADMIN users can access
    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }

    public void viewDashboard() {
        System.out.println("Dashboard is visible to all users.");
    }

    public static void main(String[] args) {
        User admin = new User("Alice", "ADMIN");
        User normalUser = new User("Bob", "USER");

        AdminPanel panel = new AdminPanel();

        // Admin user tries to delete
        System.out.println("\nTrying with ADMIN user:");
        AccessControl.checkAccess(admin, panel, "deleteUser");

        // Normal user tries to delete
        System.out.println("\nTrying with USER:");
        AccessControl.checkAccess(normalUser, panel, "deleteUser");

        // Normal user accessing an unrestricted method
        System.out.println("\nTrying to view dashboard:");
        panel.viewDashboard();  // No restriction, direct method call
    }
}
