import java.util.Arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        // Debugging
        // One Dimensional Array

        array();

        System.out.println();
        getAllEnglishAlphabetLetters();

        System.out.println();
        arrayAddress();

        System.out.println();
        compareArrays();

        System.out.println();
        copyArrays();

        System.out.println();
        everyEvenElement();
    }

    public static void array()
    {
        // byte, short, int, char, long, float, double, String
        int[] numbers; // объявление одномерного массива типа int, new - динамическое выделение памяти
        numbers = new int[5]; // выделение памяти

        // поиндексная инициализация массива с пятью элементами
        numbers[0] = 12; // 1 element
        numbers[1] = 14; // 2 element
        numbers[2] = -10000; // 3 element
        numbers[3] = 1; // 4 element
        numbers[4] = 99; // 5 element

        // numbers[5] = -1; // ArrayIndexOutOfBoundsException, return code -1, program fails, run-time error

        System.out.println("numbers[3]: " + numbers[3]);

        int[] nums = new int[] { 1, 2, 3, 4, 5 };
        // через инициализацию элементов массива идет подсчет количества этих элементов
        System.out.println("\nnums[1]: " + nums[1]);

        System.out.println();

        char[] symbols = new char[10]; // объявили и выделили память
        char[] differentSymbols = new char[] {'A', 'R', 'C', 'H', 'I', 'L'};
        String[] fruits = new String[] {"Melon", "Watermelon", "Banana", "Cherry", "Apple"};

        for (int index = 0; index < differentSymbols.length; index++) // от 0 по 5 (до 6), метод length дает
        // длину массива начиная с 1, а не 0
        {
            System.out.print(differentSymbols[index] + " ");
        }
        System.out.println("\n"); // escape sequence - \n - next line

        for (int index = 0; index < fruits.length; index++) // от 0 по 5 (до 6), метод length дает
        // длину массива начиная с 1, а не 0
        {
            System.out.println(fruits[index]);
        }

        System.out.println();

        // initialization with for
        for (int index = 0, symb = 65; index < symbols.length; index++, symb++) // от 0 по 9 (до 10), метод length дает
        // длину массива начиная с 1, а не 0
        {
            symbols[index] = (char) symb; // (char) 67, (char) 68...
        }

        // out with for
        for (int index = 0; index <= symbols.length - 1; index++) // от 0 по 9 (до 10), метод length дает
        // длину массива начиная с 1, а не 0
        {
            System.out.print(symbols[index] + " ");
        }

        System.out.println();
    }

    public static void getAllEnglishAlphabetLetters()
    {
        char[] letters = new char[26];

        // ASCII - 0 - 255
        for (int index = 0, letter = 97; index < letters.length; index++, letter++)
        {
            letters[index] = (char) letter;
        }

        for (int index = 0; index < letters.length; index++)
        {
            System.out.print(letters[index] + " ");
        }
        System.out.println();
    }

    public static void arrayAddress()
    {
        // new всегда, всегда создает новую область памяти, а там всегда будет новый адрес
        boolean[] logicalAnswers = new boolean[] {true, false, true, true, false, false, true};
        boolean[] logicalAnswers2 = new boolean[] {true, false, true, true, false, false, true};

        // logicalAnswers[index]
        // array is an addressed variable, массив это ссылочный тип
        // под именем массива находится ссылка на его первый элемент
        System.out.println("This is an address of the first element of the array:  " + logicalAnswers);
        System.out.println("logicalAnswers == logicalAnswers: " + (logicalAnswers == logicalAnswers2));
        System.out.println("This is an address of the first element of the array: " + logicalAnswers2);
    }

    public static void compareArrays()
    {
        // classic: loop for
        // library: Array.compare (библиотеку Класс Array._method())
        // Интегрированный цикл for не медленнее Класса Array

        int[] nums = new int[] { 14, 5, 19, 20};
        int[] numsTwo = new int[] {15, 6, 19, 20};

        int counter = 0;

        for (int index = 0; index < nums.length; index++)
        {
            if (nums[index] == numsTwo[index])
            {
                counter++;
            }
        }

        if (counter == nums.length)
        {
            System.out.println("Arrays nums and numsTwo are equal!");
        } else
        {
            System.out.println("Arrays nums and numsTwo are not equal!");
        }

        // Arrays
        // if equal = 0, if false = -1
        System.out.println("\n" + Arrays.compare(nums, numsTwo));

        // Shortened
        if ((Arrays.compare(nums, numsTwo)) == 0)
        {
            System.out.println("Arrays are equal!");
        } else
        {
            System.out.println("Arrays are not equal!");
        }

        System.out.println();

        // ? :
        System.out.println((Arrays.compare(nums, numsTwo) == 0) ? "Arrays are equal!" : "Arrays are not equal!");
    }

    public static void copyArrays()
    {
        String welcome[] = new String[] {"Welcome", "to", "Java"}; // Warning: C-style Array Declaration
        String[] welcomeCopy = new String[welcome.length];

        for (int index = 0; index < welcomeCopy.length; index++)
        {
            welcomeCopy[index] = welcome[index]; // Welcome = Welcome, to = to, Java = Java
        }

        for (int index = 0; index < welcomeCopy.length; index++)
        {
            System.out.println(welcomeCopy[index]);
        }

        System.out.println();

        String[] clone = welcome.clone();

        for (int index = 0; index < clone.length; index++)
        {
            System.out.println(clone[index]);
        }
    }

    public static void everyEvenElement()
    {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for (int index = 0; index < nums.length; index+=2)
        {
            System.out.print(nums[index] + " ");
        }
    }


}