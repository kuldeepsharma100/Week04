package annotations.customannotations.intermediatelevel.maxlength;

import java.lang.annotation.*;


// Define @MaxLength annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.FIELD)  // Can be applied to fields only
public @interface MaxLength {
    int value();
}
