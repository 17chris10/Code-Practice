package Diploma_Semester5.Exp3;
import java.util.Scanner;
public class NoOfVowels_3d {
    public static void main(String[] args) {
        String str = " ";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");   
        str = sc.nextLine();
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                c++;
            }
        }

        System.out.println("Number of vowels in the string: " + c);
        sc.close();
    }
}
