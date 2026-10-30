package Exp9;
import java.util.Scanner;

public class AgeCheck_9c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new ArithmeticException("Not eligible! Age is less than 18 years.");
            }
            System.out.println("Access granted! You are eligible.");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}