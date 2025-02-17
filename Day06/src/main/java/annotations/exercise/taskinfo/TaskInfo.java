package annotations.exercise.taskinfo;

import java.lang.annotation.*;


// Define custom annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime for reflection
@Target(ElementType.METHOD) // Can be applied only to methods
public @interface TaskInfo {
    int priority();  // Priority of the task
    String assignedTo();  // Name of the person assigned
}
