package Diploma_Semester5.Exp3;
import java.util.Scanner;
public class StringLengthEvenOdd_3f {
    public static void main(String[] args) {
        String str = " ";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        int l = str.length();
        if (l % 2 == 0) {
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }
        sc.close();
    }
}
