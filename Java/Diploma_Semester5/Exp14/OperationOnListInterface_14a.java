package Exp14;

import java.util.ArrayList;
import java.util.List;

public class OperationOnListInterface_14a {
    public static void main(String[] args) {
        // Implementing List interface using ArrayList
        List<String> list = new ArrayList<>();

        // 1. Insertion (Adding elements)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Mango"); // Inserting at a specific index
        System.out.println("After Insertion: " + list);

        // 2. Deletion (Removing elements)
        list.remove("Banana"); // Removing by object
        list.remove(0);        // Removing by index (removes Apple)
        System.out.println("After Deletion: " + list);

        // 3. Searching
        boolean hasCherry = list.contains("Cherry");
        int mangoIndex = list.indexOf("Mango");
        System.out.println("Contains 'Cherry'? " + hasCherry);
        System.out.println("Index of 'Mango': " + mangoIndex);

        // 4. Displaying elements
        System.out.println("Final List Display:");
        for (String item : list) {
            System.out.println("- " + item);
        }
    }
}
