package org.example.collectionClass;

import java.util.*;

public class ListClass {
    public static void main(String[] args) {
        // List
        // ArrayList
        //createList();
        //getBasicMethods();

        // LinkedList
        // getLinkedList();

        // Iterator
        getIterator();

        // 1. non-synchronized -> во время работы потоков, надо обеспечить правильную работу (thread-safe)
        // 2. ordered -> каждый раз, когда мы добавляем элемент у него есть свои индекс
        // 3. unsorted
        // 4. can contain the same elements
        // 5. can contain the null
    }

    // ArrayList
    public static void createList()
    {
        // List<String> names = new ArrayList<String>();
        List<String> names = new ArrayList<>();
        names.add("Archil");
        names.add("Yanina");
        names.add("Ivan");
        names.add("Julia");
        names.add("Anna");

        // classical for
        // range-based for
        // for collections forEach
        names.forEach(System.out::println);

        System.out.println(names);

        System.out.println();

        // У коллекции нет длины, есть размер
        // collection.get() -> берет индекс
        for (int index = 0; index < names.size(); index++)
        {
            System.out.print(names.get(index) + " ");
        }

        System.out.println();

        // range-based for
        for (String el : names)
        {
            System.out.print(el + " ");
        }

        List<String> preDeterminedArrayList = new ArrayList<>(Arrays.asList(
                "Minsk",
                "Moscow",
                "Tbilisi",
                "Vitebsk",
                "Batumi"
        ));

        System.out.println();
        System.out.println(preDeterminedArrayList);

        System.out.println();

        String[] words = new String[]{"Welcome", "to", "Java"};
//        List<String> fromStringToList = new ArrayList<>(Arrays.stream(words).toList());
        List<String> fromStringToList = new ArrayList<>(Arrays.asList(words));
        System.out.println(fromStringToList);


        System.out.println();

        List<Integer> dataNumber = new ArrayList<>(Arrays.asList(
                1294853434,
                1212305456,
                435435345
        ));

        System.out.println(dataNumber);

        // size() - real size
        // capacity()
        // ArrayList -> by default 10; by default capacity() -> 1.5;
        // ArrayList -> capacity() 10 -> 1.5 = 25, 25 * 1.5 = ...
        // capacity() > size()
        System.out.println();
        System.out.println(names.size()); // занимаемое место в памяти больше реального размера

        Integer[] numbers = dataNumber.toArray(new Integer[0]);

        System.out.println(Arrays.toString(numbers));
    }

    public static void getBasicMethods()
    {
        List<String> randomValues = new ArrayList<>(Arrays.asList("Archil", "Olga", "Kristina"));
        System.out.println(randomValues);

        // add to particular index
        randomValues.add(0, "Anastasya");

        System.out.println(randomValues);

        // Clears the whole ArrayList
        randomValues.clear();
        System.out.println(randomValues);

        // add
        randomValues.add("Random");
        randomValues.add("Random1");
        randomValues.add("ARandom");
        randomValues.add("BRandom1");

        randomValues.sort(null); // null - natural order
        System.out.println(randomValues);

        System.out.println(randomValues.contains("Random2"));
        // System.out.println(randomValues.equals()); -> compare
        randomValues.set(1, "RANDOM ONE");
        System.out.println(randomValues.get(1));
    }

    public static void getLinkedList()
    {
        // LinkedList
        List<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));

        System.out.println(linkedList);

        linkedList.get(3);
        linkedList.add("ABCDEFG");
        linkedList.set(0, "A+B");
        System.out.println(linkedList);
    }

    public static void getIterator()
    {
        List<String> values = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        Iterator<String> name = values.iterator(); //

        while (name.hasNext()) // hasNext -> true if there is another element otherwise false
        {
            System.out.println(name.next()); // next> -> get next element
        }
    }
}