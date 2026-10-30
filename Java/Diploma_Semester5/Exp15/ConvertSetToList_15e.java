package Exp15;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertSetToList_15e {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mango");
        hashSet.add("Orange");
        hashSet.add("Pineapple");

        System.out.println("Original HashSet: " + hashSet);

        // Converting HashSet to ArrayList by passing it to the ArrayList constructor
        ArrayList<String> arrayList = new ArrayList<>(hashSet);

        System.out.println("Converted ArrayList: " + arrayList);
        System.out.println("Displaying elements from ArrayList index-wise:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Index " + i + ": " + arrayList.get(i));
        }
    }
}
