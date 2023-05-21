package org.example;

import static java.lang.String.valueOf;

public class CreditCard {

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
