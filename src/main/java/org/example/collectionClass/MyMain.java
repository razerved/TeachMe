package org.example.collectionClass;

import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        // List -> ArrayList, LinkedList
//        ArrayList<String> names = new ArrayList<>(Arrays.asList("Archil", "Igor", "Ilona", "Egor"));
//
//        for (int index = 0; index < names.size(); index++)
//        {
//            System.out.println(names.get(index));
//        }
//
//        System.out.println();
//
//        Iterator<String> name = names.iterator(); // ?
//
//        while (name.hasNext()) // hasNext -> true if there is another element otherwise false
//        {
//            System.out.println(name.next()); // next> -> get next element
//        }
//
//        System.out.println("------------------------------------------------------------------");

        // 1. non-synchronized -> во время работы потоков, надо обеспечить правильную работу
        // 2. ordered -> каждый раз, когда мы добавляем элемент у него есть свои индекс
        // 3. unsorted
        // 4. can contain the same elements
        // 5. can contain the null

        // Queue -> Deque -> ArrayDeque
        // 1. ordered
        // 2. can add in the end
        // 3. delete in the beginning
        // 4. FIFO
        // 5. unsorted

        //--------------------------------------------------------------------------

        // Set:
        // 1. unordered
        // 2. usually, unsorted
        // 3. unique values
        // 4. It is used when we want to design a collection of distinct elements.

        //--------------------------------------------------------------------------

        // Set (HashSet, LinkedHashSet, TreeSet)
        // Realization: Set -> HashSet

        //------------------------------------------------------------------------

        // HashSet - collection
        // 1. HashSet stores the elements by using a mechanism called hashing.
        // Hashing -> Hashing in Java is a technique for mapping data to a secret key, that can be used as a unique identifier for data
        // 2. HashSet contains unique elements only.
        // 3. HashSet allows null value.
        // 4. HashSet class is non synchronized.
        // 5. HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
        // 6. HashSet is the best approach for search operations.
        // 7. Not ordered
        // 8. Not sorted
        // 9. Not synchronized
        // 10. The same name but not the same hasCode
        // Two hasCode 2456977 -> 2456977 (коллизия)

        ArrayList<String> arrayListNames = new ArrayList<>(Arrays.asList("Archil", "Ilona", "Egor", "Kiril", "Nikita"));
        System.out.println(arrayListNames);
        arrayListNames.add("Artiom");
        System.out.println(arrayListNames);
        Collections.sort(arrayListNames);
        System.out.println(arrayListNames);

        System.out.println();

        HashSet<String> hashSetNames = new HashSet<>();
        hashSetNames.add("Archil"); // new element -> value -> hash method, gets unique value -> sort by hashCode
        hashSetNames.add("Ilona");
        hashSetNames.add("Igor");

        System.out.println();

        System.out.println(hashSetNames);
        hashSetNames.add("Aleksandr");
        hashSetNames.add("David");
        System.out.println(hashSetNames);

        System.out.println();

        hashSetNames.add("David");
        System.out.println(hashSetNames);

        System.out.println();

        // from ArrayList to HashSet
        ArrayList<String> toHashSet = new ArrayList<>(Arrays.asList("AB", "CD", "EF", "HI"));
        HashSet<String> fromArrayList = new HashSet<>(toHashSet);
        System.out.println(toHashSet);
        System.out.println(fromArrayList);

        System.out.println();

        // from HashSet to ArrayList
        HashSet<String> toArrayList = new HashSet<>();
        toArrayList.add("KKL");
        toArrayList.add("GIL");
        toArrayList.add("AJL");
        System.out.println(toArrayList);

        ArrayList<String> getFromHashSet = new ArrayList<>(toArrayList);
        System.out.println(getFromHashSet);
        getFromHashSet.get(0);

        String fromHashSet = toArrayList.toString();

        System.out.println(fromHashSet);

        System.out.println();

        Iterator<String> itr = toArrayList.iterator();

        while (itr.hasNext())
        {
            String value = itr.next();
            System.out.println("HashSet value: " + value + "\nValue hashCode: " + value.hashCode());
        }

        System.out.println("------------------------------------------------------------------");

        // String -> сложнее проискивать и затратнее, нежели найти объект по коду integer
        // hashSetNames.equals("Archil");
        // hashSetNames.hashCode();

        System.out.println();

        //-----------------------------------------------------------------------------

        // LinkedHashSet
        // 1. The same as HashSet but
        // 2. Ordered
        // 3. Access to Elements according to their insertion
        // 4. Sorted
        // 5. Not synchronized

        LinkedHashSet<String> linkedHashSetNames = new LinkedHashSet<>();
        linkedHashSetNames.add("AF");
        linkedHashSetNames.add("BS");
        linkedHashSetNames.add("CA");
        linkedHashSetNames.add("DW");

        System.out.println("\n" + linkedHashSetNames);

        for (String el : linkedHashSetNames)
        {
            System.out.println("LinkedHashSet value: " + el + "\nValue hashCode: " + el.hashCode());
        }

        linkedHashSetNames.add("ERT");

        System.out.println();

        for (String el : linkedHashSetNames)
        {
            System.out.println("LinkedHashSet value: " + el + "\nValue hashCode: " + el.hashCode());
        }

        System.out.println("\n------------------------------------------------------");

        //----------------------------------------------------------------------------

        // interface MAP <Key, Value>
        // HasMap very close to HashSet but HashMap is combination of a K - V,
        // whereas HashSet keeps just V
        // HashSet -> hashCode (value)
        // HashMap -> key -> value
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("Door", "Дверь");
        vocabulary.put("Pen", "Ручка");
        vocabulary.put("Car", "Машина");
        vocabulary.put("Bear", "Медведь");
        vocabulary.put("Cat", "Кошка");

        System.out.println(vocabulary);
        System.out.println();
        System.out.println(vocabulary.get("Car"));

        System.out.println();

        Set<String> keys = vocabulary.keySet();
        Collection<String> values = vocabulary.values();

        System.out.println("All keys of HashMap: " + keys);
        System.out.println("All values of HashMap: " + values);

        System.out.println();

        // for
        for (Map.Entry<String, String> key : vocabulary.entrySet()) {
            System.out.println(key.getKey() + ": " + key.getValue());
        }

        System.out.println("\n");

        // Java 10+
        for (var entry : vocabulary.entrySet()) { // JS var, C# var, C++ auto
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();

        // Iterator
        Iterator<String> iterator = vocabulary.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ": " + vocabulary.get(key));
        }
    }
}