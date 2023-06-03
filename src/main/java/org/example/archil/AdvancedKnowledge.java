import java.util.Scanner;

public class AdvancedKnowledge {
    public static void main(String[] args) {
        // advanced methods - return value && parameters
        // conditional operator (flow control): if, else if / if else, switch
        // loops: while, do while, for
        // break - break a chain/construction, continue - skip iteration, return - end of the method\

        int sum = getSum(10, 14);

        // System.out.println(10 / 0); // compiler will not find out

        System.out.println(sum);

        System.out.println("Double insertion method: " + doubleInsertionMethod());

        getMyFruit("cherry");

        System.out.println();

        breakStructure();

        System.out.println();

        System.out.println(getMyFruitReturn("banana"));
    }

    public static int getSum(int x, int y) // передача параметров по значению, transfer by value
    // передача параметров по ссылке, transfer by address
    {
        // int, double, Scanner, Random

        return x * y; // return _variable
        // return 0 -> by default zero means successful compilation
    }

    public static int doubleInsertionMethod()
    {
        int number = getNumber();

        return number;
    }

    public static int getNumber()
    {
        return 10;
    }

    // re-usable code -> код который мы можем свободно использовать еще и в разных других программах
    // т.е. взять написанный метод и просто его скопировать в другую программу

    public static void ifElseSwitch()
    {
        // if - одно логическое условие
        // if else - многоступенченное логическое условие
        // замена if else switch()
//        if (10 > 5)
//        {
//
//        }
//
//        if ()
//        {
//
//        }

//        if ()
//        {
//
//        } else if ()
//        {
//
//        } else
//        {
//
//        }

//        if ()
//        {
//            // блок, область видимости
//        }
//
//        if ()
//            // true - false (skip)
//            // else - true

        {
            int sum = 10; // область видимости, область работы - уровень блок
        }

        {
            System.out.println("Welcome to Java - block"); // statement, никакого смысла этого делать - нет
        }
    }

    public static void getMyFruit(String fruit)
    {
        switch (fruit) // делать сложные логические условия не следует
        // нельзя делать или (&&)
        // но при желании можно сделать и (||)
        {
            case "melon": // if fruit == "melon" || "watermelon"
            case "watermelon":
                System.out.println("This is either melon or watermelon: " + fruit);
                break;
            case "banana":
                System.out.println("This is a " + fruit);
                break;
            case "cherry":
                System.out.println("This is a " + fruit);
                break;
            default:
                System.out.println("You have entered a wrong fruit: " + fruit);
                break;
        }
    }

    public static void loops()
    {
        // while
        // do while
        // for, always is used with arrays & collections
        // for classic, for shortened, forEach

        int count = 1;

        while(count <= 10) // first of all, logical condition, than the body
        {
            System.out.println(count++);
        }

        count = 0;

        do { // one iteration and then logical condition
            System.out.println(count++); //
        } while (count <= 10);

        // for
        for (int countTwo = 1, countThree = 10; countTwo <= 10 && countThree <= 15; countTwo++, countThree--)
        {
            System.out.println(count);
        }

        // for
        for (; ;) // eternal loop - вечный цикл
        {
            break;
        }

        for (; ;); // eternal loop - without body

        // player -> motion -> drawing -> eternal loop

//        while(true)
//        {
//
//        }

//        do {
//
//        } while (true);
    }

    public static void breakStructure()
    {
        for (int count = 1; count <= 10; count++)
        {
            if (count == 6)
            {
                break;
            }
            System.out.println("Count: " + count);
        }
        System.out.println("This is reachable after break...\n");

        for (int count = 1; count <= 10; count++)
        {
            if (count == 6)
            {
                continue;
            }
            System.out.println("Count: " + count);
        }
        System.out.println("This is reachable after continue...");

        System.out.println();

        for (int count = 1; count <= 10; count++)
        {
            if (count == 6)
            {
                return; // указаниие на срочное окончание метода - the end of the method
            }
            System.out.println("Count: " + count);
        }
        System.out.println("This is unreachable after return...");
    }

    public static String getMyFruitReturn(String fruit)
    {
        switch (fruit) // делать сложные логические условия не следует
        // нельзя делать или (&&)
        // но при желании можно сделать и (||)
        {
            case "melon": // if fruit == "melon" || "watermelon"
            case "watermelon":
                return "This is either melon or watermelon: " + fruit;
            case "banana":
                return "This is a " + fruit;
            case "cherry":
                return "This is a " + fruit;
            default:
                return "You have entered a wrong fruit: " + fruit;
        }
    }

    public static Scanner input()
    {
        return new Scanner(System.in); // неименованный Scanner
    }

    public static void getName()
    {
        String name = input().nextLine();
    }

    public static double getDouble()
    {
        return input().nextDouble();
    }
}