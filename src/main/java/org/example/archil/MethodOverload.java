public class MethodOverload {
    public static void main(String[] args) {
        sum(12.5);
        sum(12);
        sum('A');
        sum(10, 10);

        // Проблема перегрузки методов заключается в том,
        // что бывают случай, когда компилятор не может понять самостоятельно
        // в какой метод войти - это связано с переменными
        // double 0.0, double 0
        // 0 -> double || int?
    }

    public static void sum (double number)
    {
        System.out.println("Sum -> double: " + number * number);
    }

    public static void sum (int number)
    {
        System.out.println("Sum -> int: " + number * number);
    }

    public static void sum (char symbol)
    {
        System.out.println("Sum -> char: " + symbol);
    }

    public static void sum (int x, int y)
    {
        System.out.println("Sum -> int x, int y: " + (x * y));
    }
}