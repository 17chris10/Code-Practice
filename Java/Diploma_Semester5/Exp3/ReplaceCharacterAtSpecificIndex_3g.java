package Diploma_Semester5.Exp3;
import java.util.Scanner;
public class ReplaceCharacterAtSpecificIndex_3g {
    public static void main(String[] args) {
        String str = " ";
        int idx; // Index of the character to be replaced
        char newChar = ' '; // New character to replace with
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        System.out.print("Enter the index of the character to be replaced: ");
        idx = sc.nextInt();
        System.out.print("Enter the new character: ");
        newChar = sc.next().charAt(0);
        // Check if the index is valid
        str=str.substring(0, idx) + newChar + str.substring(idx + 1);
        System.out.println("Updated string: " + str);
        sc.close();
    }
}
