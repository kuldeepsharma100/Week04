package reflection.advanceproblem.methodexecutiontiming;

public class MethodTimerTest {
    public static void main(String[] args) {
        SampleMethods sample = new SampleMethods();

        // Measure execution time of both methods
        MethodTimer.executeWithTiming(sample, "fastMethod");
        MethodTimer.executeWithTiming(sample, "slowMethod");
    }
}
