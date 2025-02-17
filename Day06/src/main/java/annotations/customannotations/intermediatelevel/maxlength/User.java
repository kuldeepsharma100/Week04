package annotations.customannotations.intermediatelevel.maxlength;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)  // Restrict username to a max of 10 characters
    private String username;

    public User(String username) {
        validateMaxLength(this, username);
        this.username = username;
    }

    private void validateMaxLength(Object obj, String fieldValue) {
        try {
            Class<?> clazz = obj.getClass();
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(MaxLength.class)) {
                    MaxLength maxLength = field.getAnnotation(MaxLength.class);
                    if (fieldValue.length() > maxLength.value()) {
                        throw new IllegalArgumentException(
                                "Error: " + field.getName() + " length exceeds max limit of " + maxLength.value()
                        );
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Validation failed: " + e.getMessage());
        }
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        try {
            User user1 = new User("JohnDoe");  // Valid
            System.out.println("Valid username: " + user1.getUsername());

//            User user2 = new User("VeryLongUsername");  // Should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
