package Diploma_Semester5.Exp5;
import java.util.Scanner;

// Student class implementing both FY and SY interfaces
public class Student_5c implements InterfaceFY_5c, InterfaceSY_5c {
    private int fyRollNo, syRollNo;
    private String fyName, syName;
    private double fyResult, syResult;
    private Scanner sc;
    
    // Constructor to initialize Scanner
    public Student_5c() {
        this.sc = new Scanner(System.in);
    }
    
    // Accept data for First Year
    public void acceptFY() {
        System.out.println("\nEnter FY Roll No, Name, and Result:");
        System.out.print("FY Roll No: ");
        fyRollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("FY Name: ");
        fyName = sc.nextLine();
        System.out.print("FY Result: ");
        fyResult = sc.nextDouble();
    }
    
    // Accept data for Second Year
    public void acceptSY() {
        System.out.println("\nEnter SY Roll No, Name, and Result:");
        System.out.print("SY Roll No: ");
        syRollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("SY Name: ");
        syName = sc.nextLine();
        System.out.print("SY Result: ");
        syResult = sc.nextDouble();
    }
    
    // Display data for First Year
    public void displayFY() {
        System.out.println("\n===== FY Details =====");
        System.out.println("Roll No: " + fyRollNo);
        System.out.println("Name: " + fyName);
        System.out.println("Result: " + fyResult + "%");
    }
    
    // Display data for Second Year
    public void displaySY() {
        System.out.println("\n===== SY Details =====");
        System.out.println("Roll No: " + syRollNo);
        System.out.println("Name: " + syName);
        System.out.println("Result: " + syResult + "%");
    }
    
    public static void main(String[] args) {
        Student_5c student = new Student_5c();
        student.acceptFY();
        student.acceptSY();
        
        student.displayFY();
        student.displaySY();
        
        student.sc.close(); // Close Scanner at the end
    }
}