package Exp14;

import java.util.LinkedList;

public class OperationsOnLinkedList_14c {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // 1. Inserting elements
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(10); // Specific to LinkedList: insert at beginning
        numbers.addLast(40);  // Specific to LinkedList: insert at end
        System.out.println("LinkedList after Insertion: " + numbers);

        // 2. Deleting elements
        numbers.removeFirst(); // Removes the first element (10)
        numbers.removeLast();  // Removes the last element (40)
        numbers.remove(1);     // Removes element at index 1 (30)
        System.out.println("LinkedList after Deletion: " + numbers);

        // Re-adding elements for traversal demonstration
        numbers.add(50);
        numbers.add(60);

        // 3. Traversing elements
        System.out.print("Traversing LinkedList: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
