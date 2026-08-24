package Diploma_Semester5.Exp8;
import java.util.Scanner;
public class DivideByZeroTryCatch_8a {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 no.s: ");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        sc.close();
    }
}
