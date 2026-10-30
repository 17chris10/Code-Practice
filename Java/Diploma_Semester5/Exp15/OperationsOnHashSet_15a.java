package Exp15;

import java.util.HashSet;
import java.util.Set;

public class OperationsOnHashSet_15a {
    public static void main(String[] args) {
        // Implementing Set interface using HashSet
        Set<String> fruits = new HashSet<>();

        // 1. Insertion
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("After Insertion: " + fruits);

        // 2. Deletion
        fruits.remove("Banana");
        System.out.println("After Deletion: " + fruits);

        // 3. Searching
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains 'Apple'? " + hasApple);

        // 4. Displaying elements
        System.out.println("Displaying elements:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}
