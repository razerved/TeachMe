package org.example;

public class CreditCard {

    /**
     * Создать класс CreditCard c полями номер счета, текущая сумма на счету.
     * Добавьте метод, который позволяет начислять сумму на кредитную
     * карточку.
     * Добавьте метод, который позволяет снимать с карточки некоторую
     * сумму.
     * Добавьте метод, который выводит текущую информацию о карточке.
     * Напишите программу, которая создает три объекта класса CreditCard у
     * которых заданы номер счета и начальная сумма
     * Тестовый сценарий для проверки:
     * Положите деньги на первые две карточки и снимите с третьей.
     * Выведите на экран текущее состояние всех трех карточек.
     */

    private double money;
    private int coun;
    private int cartNumber;

    public CreditCard() {

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getCoun() {
        return coun;
    }

    public void setCoun(int coun) {
        this.coun = coun;
    }

    public int getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(int cartNumber) {
        this.cartNumber = cartNumber;
    }




}
