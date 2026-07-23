package Diploma_Semester5.Exp1;
import java.util.Scanner;
public class Reverse_SumOfDigits_1e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.print("Reversed number = ");
        while (num != 0) {
            int d = num % 10;
            sum += d;
            System.out.print(d + " ");
            num /= 10;
        }
        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}
