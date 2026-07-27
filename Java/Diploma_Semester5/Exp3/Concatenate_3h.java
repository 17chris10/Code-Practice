package Diploma_Semester5.Exp3;
import java.util.Scanner;
public class Concatenate_3h {
    public static void main(String[] args) {
        String firstname = " ";
        String lastname = " ";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstname = sc.nextLine();
        System.out.print("Enter last name: ");
        lastname = sc.nextLine();
        String concatenatedString = firstname.concat(" ").concat(lastname);
        System.out.println("Concatenated string: " + concatenatedString);
        sc.close();
    }   
}
