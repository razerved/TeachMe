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

        abonent1.sendMessage(abonent3.getNumber(), abonent1.getNumber(), abonent2.getNumber());
        abonent1.receiveCall(abonent3.getName());
        abonent1.getNumber();



        Exep first = new Exep();
        first.setLogin("12334567891234567890");

        first.setPassword("1234");

    }
}