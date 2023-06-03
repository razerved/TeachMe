package org.example.StringClass;

public class Strings {
    public static void main(String[] args) {
        getBasicStrings();
    }

    public static void getBasicStrings()
    {
        // String class -> msg -> address (stack) -> value (heap)
        // String arrays of Chars
        // 'A', 'r', 'c', 'h', 'i', 'l' -> char (2 byte) * amount of symbols = size 6 * 2 = 12 byte, 94 bit
        String msg = "Archil"; // msg -> msg1@45f -> "Archil"
        String msg1 = "ArChil";
        String msg2 = new String("Archil"); // мы создаем экземпляр класса String и заставляем его
        // насильно, выделить отдельно память
        String msg3 = "Archil"; // msg3 -> address msg (msg1@45f) - "Archil"

        // String == String -> address == address, but not values
        System.out.println("msg == msg1:" + (msg == msg1)); // false, msg -> address, msg1 -> another address
        // true -> указывает на один и тот же адрес
        System.out.println("msg == msg3: " + (msg == msg3)); // значение по регистру одинаковые
        System.out.println("msg == msg2: " + (msg == msg2)); // false, new pushes to allocate new memory

        // String optimization is called String Pool

        // String immutable
        String name = "Archil Sikharulidze"; // его нельзя менять, константа

        // Переопределяя переменную строки, мы создаем новую
        // с новым адресом и памятью
        name = "Maksym Sudarikov"; // ?????

        // String is immutable - его нельзя менять, константа
        // Джава не позволяет менять отдельные символы стр
//        name.charAt(0) = 'A';
//        name.charAt(0) = "b";
    }
}