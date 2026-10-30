package Exp14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareArrayListLinkedlist_14d {
    public static void main(String[] args) {
        int numberOfElements = 50000;

        // Testing ArrayList insertion at the beginning (index 0)
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(0, i); // Forces shifting of all subsequent elements
        }
        long endTime = System.nanoTime();
        long arrayListDuration = endTime - startTime;

        // Testing LinkedList insertion at the beginning (index 0)
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(0, i); // Only updates pointer references
        }
        endTime = System.nanoTime();
        long linkedListDuration = endTime - startTime;

        System.out.println("--- Performance Comparison (Inserting " + numberOfElements + " elements at the beginning) ---");
        System.out.println("ArrayList Time:  " + (arrayListDuration / 1_000_000) + " ms");
        System.out.println("LinkedList Time: " + (linkedListDuration / 1_000_000) + " ms");
        System.out.println("\nConclusion: LinkedList performs significantly better for frequent insertions/deletions at the beginning.");
    }
}
