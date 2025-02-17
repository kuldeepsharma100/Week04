package annotations.customannotations.beginnerlevel.importantmethod;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)  // Can be applied to methods only
public @interface ImportantMethod {
    String level() default "HIGH";
}
