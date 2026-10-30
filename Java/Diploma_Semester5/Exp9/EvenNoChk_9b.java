package Diploma_Semester5.Exp9;
import java.util.Scanner;
public class EvenNoChk_9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        try {
            if(num % 2 != 0) {
                throw new InvalidEvenNoException_9b("The number is not even.");
            }
            System.out.println(num + " is an even number.");
        } catch (InvalidEvenNoException_9b e) {
            System.out.println(e.getMessage());
        }
        finally{sc.close();}
    }
}
