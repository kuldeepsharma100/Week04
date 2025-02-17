package reflection.intermediate.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // Makes the annotation available at runtime
public @interface Author {
    String name(); // This is the annotation element
}
