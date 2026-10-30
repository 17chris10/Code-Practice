package Exp11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortLambdaExpression_11e {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Rohan");
        students.add("Aarav");
        students.add("Priya");
        students.add("Ananya");

        System.out.println("Before Sorting: " + students);

        // Sorting list using lambda expression as a Comparator
        Collections.sort(students, (s1, s2) -> s1.compareTo(s2));

        System.out.println("After Sorting Alphabetically: " + students);
    }
}