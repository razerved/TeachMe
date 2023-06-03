package org.example.StringClass;

public class StringsMethods {
    public static void main(String[] args) {
        equalsStrings();

        System.out.println();

        forCharSymbols("Welcome to Java");

        System.out.println();

        getLowerUpperRegister("Archil Sikharulidze");

        System.out.println();

        compareStrings();

        System.out.println();

        concatStrings();

        System.out.println();

        getCharAt("Java");

        System.out.println();

        getRegister("meSSage welCOME...");

        System.out.println();

        split("3456-9076-1234-0915");

        System.out.println();

        getSplitMultiply("1024/10");

        System.out.println();

        ifIsEmpty();

        System.out.println();

        getStringBuilder();
    }

    public static void equalsStrings()
    {
        String msg = "Archil";
        String msg1 = new String("Archil");
        String msg2 = "ArCHil";

        // Addresses
        System.out.println("msg == msg1: " + (msg == msg1)); // false

        // string.equals(string) -> boolean: true or false, register sensitive
        System.out.println("msg.equals(msg1):" + msg.equals(msg1)); // values - true
        System.out.println("msg.equals(msg2):" + msg.equals(msg2)); // values - false

        // euqlsIgnoreCase -> equals without register
        System.out.println("msg.equalsIgnoreCase(msg2): " + msg.equalsIgnoreCase(msg2));
    }

    public static void forCharSymbols(String values)
    {
        // for get every element of String
        char[] symbols = new char[] {'A', 'B', 'C', 'D'};

        for (char symbol : symbols)
        {
            System.out.print(symbol + "\t");
        }

        System.out.println();

        // toCharArray() -> преобразует строчку в массив символов типа char
        for (char value : values.toCharArray())
        {
            System.out.print(value + "\t");
        }
    }

    public static void getLowerUpperRegister(String values)
    {
        // Count String length
        // transforms String to char array
        // and then counts its size

        // string.length -> длина строчки
        int length = values.length(); // 19 -> пробел включительно
        char[] symbols = values.toCharArray(); // превратил строчку в массив сиволов и сохранил

        System.out.println();

        for (char symbol : symbols)
        {
            System.out.print("'" + symbol + "' ");
        }

        System.out.println();

        System.out.println("Length of my String (" + values + ") equals to: " + length);
        System.out.println("Size of my String (" + values + ") equals to: " +
                (length * 2) + " bytes (" + (length * 2) * 8 + ") bits.");
    }

    public static void compareStrings()
    {
        String msg = "Ivan";
        String msg1 = "Maksym";
        String msg2 = "Yanina";
        String msg3 = "Archil";
        String msg4 = new String ("Archil");

        // ! boolean -> true or false, 1+ (if var1 >) 0 (var1 == var2), -1 (+) (var1 < var2)
        System.out.println("msg.compareTo(msg1):" + msg.compareTo(msg1));
        System.out.println("msg2.compareTo(msg3): " + msg2.compareTo(msg3));
        System.out.println("msg.compareTo(msg3): " + msg.compareTo(msg3));
        System.out.println("msg3.compareTo(msg4): " + msg3.compareTo(msg4)); // 0
    }

    public static void concatStrings()
    {
        String name = "Archil";
        String surname = new String("Sikharulidze");

        String fullName = name + " " + surname;
        String fullNameConcat = name.concat(" " + surname);

        System.out.println("name + \" \" + surname: " + fullName);
        System.out.println("name.concat(\" \" + surname): " + fullNameConcat);
    }

    public static void getCharAt(String values)
    {
        // String -> char[] -> J a v a -> J [0], a [1], v [2], a [3]
        // string.length -> index = length - 1
        char symbol = values.charAt(values.length() - 1);

        System.out.println("Java charAt(0): " + symbol);
    }

    public static void getRegister(String values)
    {
        // from lower to upper register
        // from upper to lower register

        // toUpperCase & toLowerCase -> возвращают новое значение, но не меняют старое
        String upperRegisterValue = values.toUpperCase(); // в верхний регистр
        String lowerRegisterValue = values.toLowerCase(); // в нижний регистр

        System.out.println("Basic value: " + values);
        System.out.println("Value: " + values + ". Updated: " + upperRegisterValue);
        System.out.println("Value: " + values + ". Updated: " + lowerRegisterValue);
        System.out.println("Basic value: " + values);
    }

    public static void valueOf()
    {
        int x = 100;
        String number = "100";

        String xTurned = String.valueOf(x); // valueOf -> превращает значение x в строчку
        String xTurnedAgain = "This is a value" + x; // instead of valueOf()
        String xTurnedAgainAgain = x + " this is again x"; // instead of valueOf()

        // String xPlusX = x + x; -> result: integer
        String xStrings = "Result of: " + x + x; // Result of:100100
        String xStrings2 = "Result of: " + (x + x); // Result of: 200
    }

    public static void split(String debitCardNumber)
    {
        // Debit Card
        // 3456-9076-1234-0915
        // Result: 3456907612340915

        // regex: "_any" -> каждый раз, когда он находит его, то сохраняет в одномерном массиве под новым индексом
        // debitCard[0] -> 3456, [1] -> 9076 -> [2] -> 1234, [3] -> 0915
        String[] debitCard = debitCardNumber.split("-");

        System.out.println("Passed by value String was: " + debitCardNumber);

        for (String numbers : debitCard)
        {
            System.out.print(numbers);
        }
        System.out.println();

        String[] debitCardLimited = debitCardNumber.split("-", 3); // limit -> длина массива

        System.out.println();

        for (String element : debitCardLimited)
        {
            System.out.println(element + "\t");
        }
    }

    public static void getSplitMultiply(String value)
    {
        String[] values = value.split("/");

        double sum = Double.parseDouble(values[0]) / Double.parseDouble(values[1]);

        System.out.println("Division of " + values[0] + " on " + values[1] + " equals: " + sum);
    }

    public static void ifIsEmpty()
    {
        String name = null; // null -> значит вообще ничего, это не пустота
        String surname = "";

        System.out.println((surname.length() == 0) ? "Your string is empty" : "Your string is not empty");
        System.out.println("surname = \"\": " + surname.isEmpty());

        // System.out.println(name.isEmpty());
    }

    public static void getStringBuilder()
    {
        // StringBuilder
        // StringBuffer

        StringBuilder mutableString = new StringBuilder("Archil Sikharulidze");

        System.out.println("Basic StringBuilder: " + mutableString);
        mutableString.reverse(); // развернуть
        System.out.println("Reversed: " + mutableString);
        mutableString.append(" is a IT teacher");
        System.out.println("Appended: " + mutableString);
        mutableString.replace(0, 12, "Sikharulidze");
        System.out.println("Replaced: " + mutableString);
        mutableString.delete(13, 20);
        System.out.println("Delete: " + mutableString);
        mutableString.deleteCharAt(mutableString.length() - 1);
        System.out.println("deleteCharAt: " + mutableString);
        System.out.println("indexOf: " + mutableString.indexOf("S"));
        mutableString.setCharAt(0, 'B');
        System.out.println("setCharAt: " + mutableString);
    }
}