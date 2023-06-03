import java.util.Arrays;

public class ArraysMultiple {
    public static void main(String[] args) {
        // double and n-dimensional arrays
        initializeTwoDimensionalArray();
    }

    public static void initializeTwoDimensionalArray()
    {
        // int[] numbers -> 1, 19, 100, 15


        // int[][] numbers -> 1: 1, 2, 3
        //                    2: 4, 5, 6
        //                    3: 7, 8, 9
        // Матрица (matrix), таблица

        int[][] standardDoubleArrayInitialization;
        standardDoubleArrayInitialization = new int[3][3]; // 2 x 2 (index = 0)

        // первая строка
        standardDoubleArrayInitialization[0][0] = 10;
        standardDoubleArrayInitialization[0][1] = 11;
        standardDoubleArrayInitialization[0][2] = 12;

        // вторая строка
        standardDoubleArrayInitialization[1][0] = 13;
        standardDoubleArrayInitialization[1][1] = 14;
        standardDoubleArrayInitialization[1][2] = 15;

        // третья строка
        standardDoubleArrayInitialization[2][0] = 16;
        standardDoubleArrayInitialization[2][1] = 17;
        standardDoubleArrayInitialization[2][2] = 18;

        showDoubleDimensionalArray(standardDoubleArrayInitialization);

        // Указать только первую составляющую двойного массива - количество строк
        int[][] doubleDimensionalArray = new int[4][]; // 2 строчки (0, 1) и пока неизвестное количество столбцов

        doubleDimensionalArray[0] = new int[2]; // doubleDimensionalArray[0] -> 2 columns
        doubleDimensionalArray[1] = new int[4]; // doubleDimensionalArray[0] -> 4 columns
        doubleDimensionalArray[2] = new int[6]; // doubleDimensionalArray[0] -> 6 columns
        doubleDimensionalArray[3] = new int[8]; // doubleDimensionalArray[0] -> 8 columns

        // doubleDimensionalArray[0][0-1]
        // doubleDimensionalArray[1][0-3]
        // doubleDimensionalArray[2][0-5]
        // doubleDimensionalArray[3][0-7]
        initializeDoubleArray(doubleDimensionalArray);
        System.out.println();
        showDoubleDimensionalArray(doubleDimensionalArray);


        // Стандартный с определенным количеством строчек и столбцов
        // Для инициализации ничего особенного не надо - только индексы
        int[][] doubleDimensionalArray2 = new int [2][3];

        // Прямая инициализация массива и путем этого процесса компилятор высчитывает размер массива
        int[][] doubleDimensionalArray3 = new int[][]{
                {1, 2, 3}, // строка номер 1 (индекс 0) - строка номер 1, столбцы 1, 2, 3 (индексы, 0, 1, 2)
                {4, 5, 6}, // строка номер 2 (индекс 1)
                {7, 8, 9}, // строка номер 3 (индекс 2)
                {10, 11, 12}
                // int[] numbers = new int[] {1, 100, 91, -100};
        };

        System.out.println();
        showDoubleDimensionalArray(doubleDimensionalArray3);

        // В других языка группы С недопустимо иметь разное количество столбцов в массиве
        // 3 x 3, 4x4
        // Строка 1 - 2 столбца, строка 2 - один столбец и т.д.
        char[][] doubleDimensionalArray4 = new char[][]{
                {'*'},
                {'*', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*', '*', '*', '*'}
        };
        System.out.println();
        showDoubleDimensionalArray(doubleDimensionalArray4);
    }

    // метод принимает любой двухмерный массив, типа int
    public static void showDoubleDimensionalArray(int[][] doubleArray)
    {
        // by default - длина массива всегда равна длине ее строчек, т.е. количество строчек в массиве
        for(int rows = 0; rows < doubleArray.length; rows++)
        {
            // index[0] -> 5 cols, array.length = 3;
            // ! array.length, array[row].length -> выберет строчку и посчитает количество столбцов
            for (int cols = 0; cols < doubleArray[rows].length; cols++)
            {
                // Присвоение значения идет по столбцам, а не строчкам
                System.out.print(doubleArray[rows][cols] + " - ");
            }
            System.out.println();
        }
    }

    // Перегрузка методов
    // Function/method overload
    // Это когда сигнатура (подпись) метода разная, хотя имена методов одинаковые
    // Компилятор понимает какой именно метод надо вызвать не по имени, а по типу данных,
    // который мы передаем в этот метод
    // Сигнатура или подпись метода (method signature) - это название метода и передаваемые параметры
    public static void showDoubleDimensionalArray(char[][] doubleArray)
    {
        for(int rows = 0; rows < doubleArray.length; rows++)
        {
            for (int cols = 0; cols < doubleArray[rows].length; cols++)
            {
                System.out.print(doubleArray[rows][cols]);
            }
            System.out.println();
        }
    }

    public static void initializeDoubleArray(int[][] doubleArray)
    {
        int counter = 1;

        for(int rows = 0; rows < doubleArray.length; rows++)
        {
            for (int cols = 0; cols < doubleArray[rows].length; cols++)
            {
                doubleArray[rows][cols] = counter++;
            }
        }
    }
}