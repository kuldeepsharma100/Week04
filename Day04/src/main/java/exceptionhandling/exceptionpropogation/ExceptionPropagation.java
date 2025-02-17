package exceptionhandling.exceptionpropogation;

public class ExceptionPropagation {
    public static void method1() {
        int result = 10 / 0;
    }

    public static void method2() {
        method1();
    }


}
