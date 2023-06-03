package org.example.archil;
import java.util.Scanner;
public class Lesson3 {
    // Upper Camel Case, nominative
        public static void main(String[] args) {
            // пуль управления
            // method/function call

//        getMessage();
//        getScanner();
//        getShortScanner();
//        initializeVariables();
        }

        public static void getScanner()
        {
            Scanner enter = new Scanner(System.in);

            // nextLine();
            // next();
            // nextInt();
            System.out.print("Please enter your name: ");
            String name = enter.nextLine(); // arasdasdasdasdadsd
            System.out.println("Your name is: " + name);
            System.out.print("Please, enter your surname: ");
            String surname = enter.next();
            System.out.println("Your surname is: " + surname);

            enter.close();
        }

        public static void getShortScanner()
        {
            String name = new Scanner(System.in).nextLine();
        }

        // lower camel case, verb
        public static void getMessage()
        {
            System.out.println("This is a message from the getMessage method");
        }

        public static void initializeVariables()
        {
            // strict type - тип переменной определяет её значение
            // dynamic type - значение определяет тип переменной
            // переменные строгой типизации не меняют свой тип
            // переменные динамической типизации могут менять свой тип
            // keywords - зарезервированное слово в компиляторе

            byte myByte = 10;
            short myShort = 100;
            int myInt = 32550;

            // declaration
            byte declareByte; // trash, can't use before initialization
            // initialization
            declareByte = 110;

            int notLongInt = 1343434434;
            long myLong = 1343434434L; // long & int?

            char mySymbol = 'a';
            char mySymbolA = 'A';

            System.out.println("My letter is: " + (int) mySymbol); // преобразование типов (тип) _переменная
            System.out.println("My letter is: " + mySymbolA);

            // in case of arithmetic operations by default double
            float myFloat = 12.3555F;
            double myDouble = 124.3423423423;

            // false = 0, true > 0
            boolean isAlive = true;
            boolean isNotAlive = false;

            System.out.println("Are your alive: " + isAlive);

            String myString = "Welcome to Java"; // W e l c o m e  t o ...

            // arithmetic operations
            // division /
            // multiply *
            // plus +
            // minus -
            // modus %
            int generalNumber = 10;
            System.out.println("%: " + (10%3)); // 3 + 3 + 3 = 9, 10 - 9 = 1

            int nullNum = 0;
            int generalNum = 10;

            System.out.println(nullNum / generalNum); // 0 / 10 = not error
            // System.out.println(generalNum / nullNum); // 10 / 0 = error

            int randomNum = 1;
            int randomNumTwo = 3;
            int sum = randomNum + randomNumTwo;

            System.out.println("Sum: " + sum);

            randomNum = randomNum + 2;
            randomNum += 2; // short version, the same as random = random + 2, /, *
            randomNum *= 4;

            System.out.println(randomNum);

            // post-increment, post-decrement
            int num = 1;
            num++; // num += 1 & num = num + 1, post-increment
            num--; // post-decrement, num -= 1 & num = num - 1

            // pre-increment, pre-decrement
            ++num; // в сложной формуле: пока выполнится прибавление, а потом уже все остальное
            --num; //
            System.out.println("num: " + num);
            System.out.println("num: " + num++);
            System.out.println("num: " + num);
            System.out.println("num: " + ++num);

            // расширение типа, от маленького к большому
            byte byteType = 100;
            int intType = byteType;
            long longType = intType;

            int myInteger = 2349;
            byte myByteInt = (byte) myInteger; // cast, приведение типа
            System.out.println(myByteInt);

            int intToDouble;
            double doubleNumber = 123.456;
            intToDouble = (int) doubleNumber;
            System.out.println(intToDouble);
        }
    }

