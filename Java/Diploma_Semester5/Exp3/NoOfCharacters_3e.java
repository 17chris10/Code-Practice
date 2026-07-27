package Diploma_Semester5.Exp3;
import java.util.Scanner;
public class NoOfCharacters_3e {
    public static void main(String[] args) {
        String str = " ";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        int c = 0;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            if(!Character.isWhitespace(ch))
                c++;
        }
        System.out.println("Number of characters in the string: " + c);
        sc.close();
    }
}
