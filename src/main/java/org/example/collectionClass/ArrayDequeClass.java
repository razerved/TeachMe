package org.example.collectionClass;

import java.util.*;

public class ArrayDequeClass {
    public static void main(String[] args) {
        // Queue -> Deque -> ArrayDeque
        // 1. ordered
        // 2. can add in the end
        // 3. delete in the beginning
        // 4. FIFO
        // 5. unsorted

        Queue<Integer> numbers = new ArrayDeque<>(Arrays.asList(4, 2, 5, 3, 10, 10, 2));

        System.out.println(numbers);

//        numbers.element();
//        numbers.offer(12);
//        numbers.peek();
//        numbers.poll();
    }
}