package annotations.customannotations.advancelevel.roleallowed;

public class User {
    private String username;
    private String role;  // Example: "ADMIN", "USER"

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }
}
