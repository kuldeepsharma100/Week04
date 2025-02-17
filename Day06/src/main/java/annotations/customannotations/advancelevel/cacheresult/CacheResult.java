package annotations.customannotations.advancelevel.cacheresult;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define @CacheResult annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)  // Can be applied only to methods
public @interface CacheResult {
}
