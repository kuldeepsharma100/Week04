package reflection.advanceproblem.methodexecutiontiming;

public class SampleMethods {
    public void fastMethod() {
        System.out.println("Executing fast method...");
    }

    public void slowMethod() {
        System.out.println("Executing slow method...");
        try {
            Thread.sleep(2000); // Simulate a slow operation (2 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
