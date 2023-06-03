package org.example.Zoo;

public class RangeBasedFor {
    public static void main(String[] args) {
        allAboutFor();
    }

    public static void arrays()
    {
        int[][] doubleArray = new int[2][2]; // Матрица
        int[][][] tripleArray = new int[3][][]; // Куб
        int[][][][] fourArray = new int[3][][][]; // .....

        for (int rows = 0; rows < doubleArray.length; rows++)
        {
            for (int cols = 0; cols < doubleArray[rows].length; cols++)
            {
                System.out.print(doubleArray[rows][cols]);
            }
        }

        char[][] charTree = new char[][]{
                {'*'},
                {'*', '*', '*'},
                {'*', '*', '*', '*', '*'}
        };

        String[][] names = new String[2][];
        names[0] = new String[1];
        names[1] = new String[3];
    }

    // Method call with two-dimensional array as an argument
    public static void getArray(int[][] array)
    {

    }

    public static void allAboutFor()
    {
        // initialization; logical condition; increment/expression
        for (int index = 1; index <= 10; index++)
        {
            System.out.print(index + " ");
        }

        System.out.println();

        // classical for with arrays
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        for (int index = 0; index < numbers.length; index++)
        {
            System.out.print(numbers[index] + " ");
        }

        System.out.println();

        // range-based for loop
        for (int elements : numbers) // for (объяви переменную типа int elements и сохрани туда каждое значение
        // из массива : numbers)
        {
            System.out.print(elements + " ");
        }

        // Cannot change value of the array
        for (int elements : numbers)
        {
            elements = 10;
        }

        System.out.println();

        for (int elements : numbers) // for (объяви переменную типа int elements и сохрани туда каждое значение
        // из массива : numbers)
        {
            System.out.print(elements + " ");
        }

        System.out.println();

        String[][] names = new String[][]{
                {"Archil", "Aleksey"},
                {"Ivan"},
                {"Darya"}
        };

        for (String[] outer : names) // String[] outer = names[0]
        {
            for (String name : outer) // String name = outer[0, 1]
            {
                System.out.print(name + " ");
            }
            System.out.println();
        }

        int[][][] tripleArray = new int[2][2][2];

        for (int [][] el1 : tripleArray)
        {
            for (int [] el2 : el1)
            {
                for (int el3 : el2)
                {
                    System.out.println("Some text");
                }
            }
        }
    }
}