package Exp14;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingCollectionsSortMethod_14e {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding unsorted numbers
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(33);
        numbers.add(7);

        System.out.println("Before Sorting: " + numbers);

        // 1. Sorting in Ascending Order
        Collections.sort(numbers);
        System.out.println("After Sorting (Ascending): " + numbers);

        // 2. Sorting in Descending Order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("After Sorting (Descending): " + numbers);
    }
}
