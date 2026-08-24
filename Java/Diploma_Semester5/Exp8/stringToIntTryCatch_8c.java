package Diploma_Semester5.Exp8;
import java.util.Scanner;
public class stringToIntTryCatch_8c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        String str = sc.nextLine();
        try {
            int n = Integer.parseInt(str);
            System.out.println("You entered: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid Input. Please enter a valid integer.");
        } finally {
            System.out.println("str attempt completed.");
        }
        sc.close();
    }
}
