package Diploma_Semester5.Exp3;
import java.util.Scanner;
public class PalindromeSting_3b {
    public static void main(String[] args) {
        String str =" ",rev="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        char ch;
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            rev += ch;
        }
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
        sc.close();
    }
}
