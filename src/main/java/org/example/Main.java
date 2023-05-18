package org.example;

public class Main {
    public static void main(String[] args) {
        CreditCard anna = new CreditCard(50, "000001");
        CreditCard katy = new CreditCard(100, "000002");
        CreditCard liza = new CreditCard(300, "000003");

        anna.setCurrentAmount(100);
        System.out.println("Information about Anna: " + anna.getCurrentAmount());

        katy.setCurrentAmount(100);
        System.out.println("Information about Ylia: " + katy.getCurrentAmount());

        liza.debitingAmoubt(50);
        System.out.println("Information about Margo: " + liza.getCurrentAmount());

    }





}