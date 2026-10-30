package Exp15;

import java.util.HashSet;

public class CommonElementsFindUsingHashSet_15d {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Python");
        set2.add("Ruby");
        set2.add("Java");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Finding common elements using retainAll()
        HashSet<String> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);

        System.out.println("Common Elements: " + commonElements);
    }
}
