package org.example.collectionClass;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class ThreeSetClass {
    public static void main(String[] args) {
        // Unique keys
        // Sorted order
        SortedSet<Integer> tree = new TreeSet<>(Arrays.asList(2, 6, 3, 4, 5));

        System.out.println(tree);

        // lowest
        System.out.println(tree.first());

        // highest
        System.out.println(tree.last());
    }
}