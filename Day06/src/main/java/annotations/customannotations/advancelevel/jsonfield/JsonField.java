package annotations.customannotations.advancelevel.jsonfield;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define @JsonField annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.FIELD)  // Can be applied to fields only
public @interface JsonField {
    String name();  // Custom JSON key name
}
