package org.example;

import org.example.phone.Phone;

public class Main {
    public static void main(String[] args) {
        Phone abonent1 = new Phone("90001112233", "Samsung", 65 );
        Phone abonent2 = new Phone("+790001112233", "Samsung", 55 );
        Phone abonent3 = new Phone("+790001112277", "Iphone", 35 );

        abonent1.setName("Potter");
        abonent2.setName("Dumbledore");
        abonent3.setName("Voldemort");

        abonent1.sendMessage("+790001112277", "90001112233");
        abonent1.receiveCall(abonent3.getName());
        abonent1.getNumber();

    }
}