package Diploma_Semester5.Exp6;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorkExperienceCalc_6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Joining Date (dd-MM-yyyy): ");
        String joiningDate = sc.nextLine();

        // Formatter to read and display date in dd-MM-yyyy format
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Convert input string to LocalDate
        LocalDate jd = LocalDate.parse(joiningDate, f);
        LocalDate today = LocalDate.now();

        // Calculate work experience
        Period exp = Period.between(jd, today);

        // Display results
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Name : " + name);
        System.out.println("Joining Date  : " + jd.format(f));
        System.out.println("Work Experience: " 
                + exp.getYears() + " years, " 
                + exp.getMonths() + " months, " 
                + exp.getDays() + " days");

        sc.close();
    }
}