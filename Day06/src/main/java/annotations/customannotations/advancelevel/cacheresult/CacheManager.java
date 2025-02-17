package annotations.customannotations.advancelevel.cacheresult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invokeWithCache(Object obj, String methodName, int arg) {
        try {
            // Generate a unique cache key
            String cacheKey = methodName + "-" + arg;

            // Check if result is already cached
            if (cache.containsKey(cacheKey)) {
                System.out.println("Returning cached result for: " + cacheKey);
                return cache.get(cacheKey);
            }

            // Find the method explicitly using int.class
            Method method = obj.getClass().getMethod(methodName, int.class);

            // Check if method has @CacheResult annotation
            if (method.isAnnotationPresent(CacheResult.class)) {
                // Invoke the method and cache the result
                Object result = method.invoke(obj, arg);
                cache.put(cacheKey, result);
                return result;
            } else {
                return method.invoke(obj, arg);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error executing method: " + e.getMessage());
        }
    }
}
