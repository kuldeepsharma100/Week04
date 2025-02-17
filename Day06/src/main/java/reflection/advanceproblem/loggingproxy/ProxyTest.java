package reflection.advanceproblem.loggingproxy;

public class ProxyTest {
    public static void main(String[] args) {
        // Create the original object
        Greeting original = new GreetingImpl();

        // Create a proxy instance
        Greeting proxy = (Greeting) LoggingProxy.createProxy(original);

        // Call a method on the proxy
        proxy.sayHello("Alice");
    }
}
