package Diploma_Semester5.Exp9;
import java.util.Scanner;

public class PasswordChkUsingThrow_9a {
    public static void main(String[] args) {
        String pwd = "pass123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String inputPwd = sc.nextLine();
        try {
            if(!inputPwd.equals(pwd)) {
                throw new InvalidPwdException_9a("Authentication failure.");
            }
            System.out.println("Authentication successful.");
        } catch (InvalidPwdException_9a e) {
            System.out.println(e.getMessage());
        }
        finally{sc.close();}
        
    }
}
