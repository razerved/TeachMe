package org.example;

import static java.lang.String.valueOf;

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

    private double currentAmount;
    private String scoreNumber;
    private String cartNumber;


    public CreditCard(double currentAmount, String scoreNumber) {
        this.currentAmount = currentAmount;
        this.scoreNumber = scoreNumber;

    }
    public CreditCard(double currentAmount, String scoreNumber, String cartNumber) {
        this.currentAmount = currentAmount;
        this.scoreNumber = scoreNumber;
        this.cartNumber = cartNumber;
    }

    public String getCurrentAmount() {
        return valueOf(currentAmount) + " руб";
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = this.currentAmount + currentAmount;
    }

    public void debitingAmoubt(double debiting){
        this.currentAmount  = this.currentAmount - debiting;
    }

    public void setAmount(double currentAmount) {

    }
    public String getScoreNumber() {
        return scoreNumber;
    }

    public void setScoreNumber(String scoreNumber) {
        this.scoreNumber = scoreNumber;
    }

    public String getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(String cartNumber) {
        this.cartNumber = cartNumber;
    }




}
