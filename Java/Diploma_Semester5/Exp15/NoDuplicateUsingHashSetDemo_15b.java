package Exp15;

import java.util.HashSet;

public class NoDuplicateUsingHashSetDemo_15b {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();

        // Adding elements including duplicates
        boolean firstRed = colors.add("Red");
        boolean firstBlue = colors.add("Blue");
        boolean duplicateRed = colors.add("Red"); // Duplicate element

        System.out.println("Added 'Red' first time: " + firstRed);
        System.out.println("Added 'Blue': " + firstBlue);
        System.out.println("Added 'Red' second time (duplicate): " + duplicateRed);

        // Displaying final set
        System.out.println("Final HashSet elements: " + colors);
        System.out.println("Total unique elements: " + colors.size());
    }
}
