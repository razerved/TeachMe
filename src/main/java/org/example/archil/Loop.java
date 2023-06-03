public class Loop {
    public static void main(String[] args) {
        // loop while, do, for
        // повтор кода до определенного логического значения
        whileLoop();
        System.out.println();
        doWhileLoop();
        System.out.println();
        forLoop();

        // Разобраться следующие ключевые слова в связке с
        // условными операторами и циклами
        // break - сломать схему
        // continue - пропустить одну итерацию
        // return - закрыть весь метод
    }

    public static void whileLoop()
    {
        int counter = 1;

        System.out.println("while loop:");
        // пока проверяется логическое условие, а потом выполняется тело
        while (counter <= 10) // логическое условие
        {
            System.out.println(counter++); // тело, что должно произойти
        }
    }

    public static void doWhileLoop()
    {
        int counter = 1;

        System.out.println("do while loop:");

        // пока хотя бы один раз выполняется, а потом уже идет проверка логического условия
        do {
            System.out.println(counter++); // тело, что должно произойти
        } while (counter <= 10);
    }

    public static void forLoop()
    {
        System.out.println("for loop:");

        // classic
        // все массивы итерируются через цикл for
        for (int counter = 1; counter <= 10; counter++)
        // for (переменная для логической операции; логическое условие; счетчик цикла)
        {
            System.out.println(counter);
        }
    }
}