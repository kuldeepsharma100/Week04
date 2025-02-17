package exceptionhandling.exceptionpropogation;

public class PropogationMain {
    public static void main(String[] args) {
        try {
            ExceptionPropagation.method2(); // Exception propagates to main()
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }

}
