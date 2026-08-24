package Diploma_Semester5.Exp8;
import java.util.Scanner;
public class IdxNotInArr_DivideByZero_TryCatch_8d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter 5 elements: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();
        int a, b;
        System.out.print("Enter 2 no.s: ");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            System.out.println("Element at index " + index + ": " + arr[index]);
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter an index between 0 and 4.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Attempt completed.");
        }
        sc.close();
    }
}
