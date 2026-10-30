package Exp9;
import java.util.Scanner;

// Custom Exception class
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class StdMksCheck_Exception_9e {
    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid Marks! Marks must be between 0 and 100.");
        } else {
            System.out.println("Valid Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student marks (0-100): ");
        int marks = sc.nextInt();

        try {
            checkMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
