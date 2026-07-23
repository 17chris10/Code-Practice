package Diploma_Semester5.Exp1;
import java.util.Scanner;
public class Greatest3Nos_1c {
    public static void main(String[] args) {
        int a, b, c, max=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 no.s: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            max=a;
        } else if (b > a && b > c) {
            max=b;
        } else {
            max=c;
        }
        System.out.println("Greatest number is: " + max);
        sc.close();
    }
}
