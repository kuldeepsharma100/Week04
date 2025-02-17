package reflection.advanceproblem.loggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingProxy implements InvocationHandler {
    private final Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Logging before the method execution
        System.out.println("Invoking method: " + method.getName());

        // Execute the actual method
        return method.invoke(target, args);
    }

    // Factory method to create a proxy instance
    public static Object createProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LoggingProxy(target)
        );
    }
}
