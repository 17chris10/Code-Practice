package Diploma_Semester5.Exp1;
import java.util.Scanner;
public class Calculator_1d {
    public static void main(String[] args) {
        int a, b, result= 0;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no., operator, 2nd no.: ");
        a=sc.nextInt();
        op=sc.next().charAt(0);
        b=sc.nextInt();
        switch(op) {
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                result=a/b;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("Result = " + result);
        sc.close();
    }
}
