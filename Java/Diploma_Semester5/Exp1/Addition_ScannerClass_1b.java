package Diploma_Semester5.Exp1;
import java.util.Scanner;
public class Addition_ScannerClass_1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum = 0;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        sum = a + b;
        sc.close();
        System.out.println("Sum = " + sum);
    }
}
