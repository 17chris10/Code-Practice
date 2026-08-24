package Diploma_Semester5.Exp8;
import java.util.Scanner;
public class ArrIdxOutOfSizeTryCatch_8b {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 elements: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();
        try {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter an index between 0 and 4.");
        }
        finally {
            System.out.println("Access attempt completed.");
        }
        sc.close();
    }
}
