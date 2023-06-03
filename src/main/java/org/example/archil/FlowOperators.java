public class FlowOperators {
    public static void main(String[] args) {
        // conditional operators, flow manipulators
        // if, else if, switch
        switchOperator();
    }

    public static void ifOperator()
    {
        // logical condition by default true
        if (10 > 5) // больше, if, yes
        {
            System.out.println("10 is bigger than 5");
        }

        if (10 < 5) // меньше
        {
            System.out.println("10 < 5");
        }

        if (10 == 5) // равняется ==
        {
            System.out.println("10 == 5");
        }

        System.out.println();
        // <= (меньше или равно), >= (больше или равно), != (не равно)
        if (11 != 10) // true
        {
            System.out.println("11 != 10");
        }

        // 1 до 18 - 1 < 18, 1 по 18 - 1 <= 18
    }

    public static void elseIfOperator()
    {
        if (10 > 5)
        {
            System.out.println("10 > 5");
        } else if (10 < 5)
        {
            System.out.println("10 < 5");
        } else if (10 == 5)
        {
            System.out.println("10 == 5");
        } else
        {
            System.out.println("You have entered some crap!");
        }

        // just if with else
        if (10 == 5)
        {
            System.out.println("10 == 5");
        } else
        {
            System.out.println("10 != 5");
        }

        // without brackets
        if (10 == 10) // true, line 64 - 65; false - line 65, true - выполни последующую сточку
            System.out.println("10 == 10");

        System.out.println("Done!");
    }

    public static void ifAdvanced()
    {
        int age = 36;

        if (age > 18 && age < 35) // если мне больше 18 и меньше 35
        {
            System.out.println("I am still a young boy...");
        } else
        {
            System.out.println("You are either an underaged or not young anymore...");
        }

        System.out.println();

        if (age == 18 || age == 35) // мне или 18 или 35
        {
            System.out.println("You are either 18 years old or 35 years old...");
        } else
        {
            System.out.println("Just info");
        }

        System.out.println();

        // by default logical condition - true
        // by default logical condition - false !
        boolean married = false;

        // ! - не
        if (married) // by default true,
        {
            System.out.println("You are married!");
        }

        if (!married) // by default true
        {
            System.out.println("You are not married!");
        }
    }

    public static void ternaryOperator()
    {
        int biggerNumber = (10 > 5) ? 10 : 5; // (logical condition) ? _true : _false;
        System.out.println(biggerNumber);
        System.out.println((10 > 5) ? 10 : 5);

        int age = 17;

        // если меньше 18 ? истина : (логический вопрос) ? истина : ложь
        String status = (age < 18) ? "Underaged" : (age < 35) ? "Young" : "Old";

        System.out.println(status);
    }

    public static void switchOperator()
    {
        String fruit = "watermelon";

        // switch нельзя вставить "или"
        switch(fruit)
        {
            case "melon":
                System.out.println("Melon");
                break;
            case "watermelon":
                System.out.println("Watermelon");
                break;
            case "banana":
                System.out.println("Banana");
                break;
            default:
                System.out.println("This is unknown fruit...");
                break;
        }
    }
}