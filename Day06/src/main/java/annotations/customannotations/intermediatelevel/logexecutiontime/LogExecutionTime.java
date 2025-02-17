package annotations.customannotations.intermediatelevel.logexecutiontime;

import java.lang.annotation.*;


// Define custom annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)  // Can be applied to methods only
public @interface LogExecutionTime {
}
