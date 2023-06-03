package org.example.Zoo;

public class MethodOverload {
    public static void main(String[] args) {
        // Мне нужно высчитать сумму двух чисел
        // Или же вывести значение чего-либо
        array("Archil", "Teona", "Ivan", "Nikolay");
        multipleArgumentsVarArg(10, 5, 1, 4, 5, 6);
    }

    public static void array (String ... nums) // я передаю определенное количество переменных типа String
    // но я не знаю, точно какое.
    {
        for (String elements : nums)
        {
            System.out.print(elements + " ");
        }
    }

    // Error, compiler will not understand when the vararg ends
//    public static void arrayMultipleArguments (String ... nums, int x, int y)
//    {
//
//    }

    public static void multipleArgumentsVarArg (int x, int y, int ... numbers)
    {
        int sum = x * y + numbers[0];

        System.out.println(sum);
    }

    // Signature -> название метода и передаваемые переменные
    public static void sum(int x)
    {
        //
    }

    public static void sum(double x)
    {
        //
    }

    public static void sum(char ch)
    {
        //
    }
}