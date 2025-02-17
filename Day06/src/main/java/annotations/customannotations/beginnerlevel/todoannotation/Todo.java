package annotations.customannotations.beginnerlevel.todoannotation;

import java.lang.annotation.*;

// Define @Todo annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)  // Can be applied to methods only
public @interface Todo {
    String task();  // Mandatory task description
    String assignedTo();  // Mandatory developer name
    String priority() default "MEDIUM";  // Default priority is "MEDIUM"
}
