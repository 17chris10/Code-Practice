package Diploma_Semester5.Exp6;
import Diploma_Semester5.Exp6.Useful.*;
import java.util.Scanner;
public class Main_6a {
    public static void main(String[] args) {
        Useme_6a obj = new Useme_6a();
        Scanner sc = new Scanner(System.in);
        String ch="";
        System.out.println("=====Area=====");
        System.out.println("Enter your choice: \n1. Rectangle\n2. Square\n3. Circle");
        ch = sc.nextLine();
        switch(ch) {
            case "1":
                System.out.println("Enter length and breadth:");
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                obj.area(length, breadth);
                break;
            case "2":
                System.out.println("Enter side of square:");
                int side = sc.nextInt();
                obj.area(side);
                break;
            case "3":
                System.out.println("Enter radius of circle:");
                double radius = sc.nextDouble();
                obj.area(radius);
                break;
            default:
                System.out.println("Invalid choice.");
        }
         System.out.println("=====Salary=====");
        System.out.println("Enter Basic, HRA and DA:");
        int basic = sc.nextInt();   
        int hra = sc.nextInt();
        int da = sc.nextInt();
        System.out.println("Basic: " + basic + ", HRA: " + hra + ", DA: " + da);
        obj.salary(basic, hra, da);
       
        System.out.println("=====Percentage=====");
        System.out.println("Enter Total Marks and Obtained Marks:");
        int totalMarks = sc.nextInt();
        int obtainedMarks = sc.nextInt();
        System.out.println("Total Marks: " + totalMarks + ", Obtained Marks: " + obtainedMarks);
        obj.percentage(totalMarks, obtainedMarks);

        sc.close();
    }
}
