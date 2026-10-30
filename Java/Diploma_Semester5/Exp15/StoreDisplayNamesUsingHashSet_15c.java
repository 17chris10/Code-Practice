package Exp15;

import java.util.HashSet;

public class StoreDisplayNamesUsingHashSet_15c {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();

        // Storing employee names
        employees.add("Alice Smith");
        employees.add("Bob Jones");
        employees.add("Catherine Lee");
        employees.add("David Miller");
        employees.add("Alice Smith"); // Duplicate entry will be automatically ignored

        System.out.println("--- Employee Directory ---");
        for (String name : employees) {
            System.out.println("- " + name);
        }
    }
}
