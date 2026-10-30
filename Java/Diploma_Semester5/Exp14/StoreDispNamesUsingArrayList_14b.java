package Exp14;

import java.util.ArrayList;

public class StoreDispNamesUsingArrayList_14b {
    public static void main(String[] args) {
        // Create an ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        // Storing student names
        students.add("Alice Johnson");
        students.add("Bob Smith");
        students.add("Charlie Brown");
        students.add("Diana Prince");
        students.add("Ethan Hunt");

        // Displaying total number of students
        System.out.println("Total Students: " + students.size());
        System.out.println("--- Student Roster ---");

        // Displaying elements using a for-each loop
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }
}
