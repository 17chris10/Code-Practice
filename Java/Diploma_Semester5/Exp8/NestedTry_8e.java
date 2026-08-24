package Diploma_Semester5.Exp8;
import java.util.Scanner;
public class NestedTry_8e
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30};

        try {
            System.out.print("Enter array index (0-2): ");
            int idx = sc.nextInt();

            try {
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                int result = arr[idx] / divisor;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid array index.");
        }

        sc.close();
    }
}