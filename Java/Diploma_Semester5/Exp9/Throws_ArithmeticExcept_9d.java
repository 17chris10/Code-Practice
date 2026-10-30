package Exp9;


public class Throws_ArithmeticExcept_9d {
    // Declaring exception using throws keyword
    static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Attempting division:");
            divide(10, 0); // Calling method that throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Handled in main: Cannot divide by zero!");
        }
    }
}