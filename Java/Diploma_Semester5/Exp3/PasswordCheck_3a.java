package Diploma_Semester5.Exp3;
import java.util.Scanner;
public class PasswordCheck_3a {
    public static void main(String[] args) {
        String pwd = "abc123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String inputPwd = sc.nextLine(); // This should be taken from user input in a real scenario

        if (inputPwd.equals(pwd)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
        sc.close();
    }
}
