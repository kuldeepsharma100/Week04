package annotations.customannotations.advancelevel.cacheresult;

public class ExpensiveOperations {

    @CacheResult  // Enable caching
    public long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        ExpensiveOperations operations = new ExpensiveOperations();

        System.out.println("\nFirst call (calculating Fibonacci(10)):");
        long result1 = (long) CacheManager.invokeWithCache(operations, "fibonacci", 10);
        System.out.println("Result: " + result1);

        System.out.println("\nSecond call (should return cached Fibonacci(10)):");
        long result2 = (long) CacheManager.invokeWithCache(operations, "fibonacci", 10);
        System.out.println("Result: " + result2);

        System.out.println("\nComputing Fibonacci(15):");
        long result3 = (long) CacheManager.invokeWithCache(operations, "fibonacci", 15);
        System.out.println("Result: " + result3);
    }
}
