package junit.basicjunittest.parameterizedtest;

public class NumberUtils {

    // Method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Main method to manually test the isEven method
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();

        System.out.println("Is 2 even? " + numberUtils.isEven(2));
        System.out.println("Is 7 even? " + numberUtils.isEven(7));

    }
}
