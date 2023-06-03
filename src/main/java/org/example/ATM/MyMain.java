package org.example.ATM; // Java file MyMain is in the package ATM

public class MyMain {
    public static void main(String[] args) {
        ATM.CreditCard tbc = new ATM.CreditCard("Mr.", "Archil Sikharulidze", "5146-4309-1112-3409", 1200);
        ATM.CreditCard bog = new ATM.CreditCard("Mss.", "Teona Mamukishvili", "1345-1234-0923-0101", 1200);

        tbc.getCreditCardInfo();

        System.out.println();

        bog.getCreditCardInfo();

        // add to balance
        // take out some money

        System.out.println();

        if (tbc.getBalance() > bog.getBalance())
        {
            System.out.println(tbc.getCardHolder() + " has more money than " + bog.getCardHolder());
        } else if (tbc.getBalance() < bog.getBalance())
        {
            System.out.println(bog.getCardHolder() + " has more money than " + tbc.getCardHolder());
        } else
        {
            System.out.println(bog.getCardHolder() + " has the same amount of money as " + tbc.getCardHolder());
        }

        System.out.println();

        // String нельзя сравнивать по == (за строчкой находится ссылка на значение)
        // System.out.println(tbc.getPrefix() == bog.getPrefix()); -> нельзя делать
        System.out.println(tbc.getPrefix().equals(bog.getPrefix())); // equals () -> сравнивает не ссылка, а значения
    }
}