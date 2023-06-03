package org.example.StringClass;

public class MyStrings {
    public static void main(String[] args) {
        String str1 = "Login";
        String str2 = "Log";
        String str3 = "Login";
        String str4 = "Archil Sikharulidze";
        String str5 = "ARCHIL sIKhARULIDZe";

        // toUpperCase()
        System.out.println(str4.toUpperCase());
        System.out.println(str4);
        str4 = str4.toUpperCase();
        System.out.println(str4 + "\n\n");

        // toLowerCase()
        System.out.println(str4.toLowerCase());
        System.out.println(str4);
        str4 = str4.toLowerCase();
        System.out.println(str4 + "\n\n");

        // length()
        int stringLength = str4.length();
        System.out.println("str4.length(): " + stringLength + "\n\n");

        // valueOf(type)
        // indexOf("");
        // indexOf(string, index)

        // charAt()
        System.out.println(str1.charAt(0) + "\n\n");

        for (int index = 0; index < str1.length(); index++)
        {
            System.out.print(str1.charAt(index) + "\t");
        }

        // str1.charAt(0) = 'B'; -> нельзя менять значения

        System.out.println("\n");

        // contains("")

        // equals - bool type, true or false
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        // equalsIgnoreCase()
        System.out.println("str4: " + str4);
        System.out.println("str5: " + str5);
        System.out.println("str4.equalsIgnoreCase(str5): " + str4.equalsIgnoreCase(str5) + "\n\n");


        // concat()
        String inter = "Interface";
        String loginInterface = str1 + " " + inter; // объединения
        String loginInterface2 = str1.concat(" " + inter);

        System.out.println("loginInterface = str1 + \" \" + inter: " + loginInterface);
        System.out.println("loginInterface2 = str1.concat(\" \" + inter): " + loginInterface2 + "\n\n");

        // trim -> удаляет пробелы в начале и в конце сточки
        String nameWithSpace = "   Archil    ";
        String nameWithoutSpace = nameWithSpace.trim() + "!";
        System.out.println(nameWithoutSpace + "\n\n");

        // isEmpty
        String nullString = null; // вообще ничего нет, даже ссылки
        String emptyString = ""; // строчка есть, но пустая

        System.out.println("emptyString = \"\": " + emptyString.isEmpty()); // true
        // System.out.println(nullString.isEmpty()); // Exception

        emptyString = " ";
        System.out.println("emptyString = \" \": " + emptyString.isEmpty()); // true

        // substring(index) -> substring(index, index)

        // split(char, limit)
        System.out.println("\n\n");
        String names = "Ilona Igor Kiril Nikolai";
        String[] splittedNames = names.split(" ");

        for (int index = 0; index < splittedNames.length; index++)
        {
            System.out.print(splittedNames[index] + "\t");
        }

        System.out.println("\n");

        // endsWith(string)
        // startsWith(string, index)


        // StringBuilder -> изменяемая строчка
        // append()
        // insert()
        // delete
        // deleteCharAt()
        // setCharAt()
        String startingMessage = "Welcome to StringBuilder";

        StringBuilder longString = new StringBuilder(startingMessage);

        System.out.println(longString);
        System.out.println("longString.length(): " + longString.length());

        longString.setCharAt(7, '+');
        System.out.println(longString);

        longString.append(". This is append method.");
        System.out.println(longString);

        longString.insert(0, '!');
        System.out.println(longString);

        // 19, индекс (18) - длина - 1, 19
        longString.delete(longString.length() - 1, longString.length());
        System.out.println(longString);

        longString.deleteCharAt(8); // +
        System.out.println(longString);
    }

    static void basicString()
    {
        // String Pool
        // Heap

        // String -> Heap особая память в которой хранится мое значение
        // String -> метод отпимизации -> String Pool
        String str1 = "Sikharulidze"; // 1 method -> str1 (0x0012) -> Sikharulidze
        String str2 = "Sikharulidze"; // str2 -> ((0x0012)) Sikharulidze
        String str4 = "sikharulidze"; // str4 -> 0x00013

        String str3 = new String("Sikharulidze"); // 2 method

        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str1 == str4: " + (str1 == str4));
        System.out.println("str1.equals(str2): " + (str1.equals(str2))); // true
        System.out.println("str1 == str3: " + (str1 == str3));

        // String неизменяем, String immutable
        String surname = "Sikharulidze"; // 0x00012
        surname = "Archil"; // это уже новая строчка с новой ссылкой, 0x00089

        // String final
        final String sur = "Sikharulidze"; // вы не можете поменять ссылку строчки, а не значение
        // sur = "Archil"; -> тут пока пытается поменять ссылку, а это словом final запрещено
    }
}