package annotations.customannotations.advancelevel.roleallowed;

import java.lang.annotation.*;

// Define @RoleAllowed annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)  // Can be applied to methods only
public @interface RoleAllowed {
    String value();  // Role required for access (e.g., "ADMIN")
}
