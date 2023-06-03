package ATM;

public class CreditCard {
    private String prefix;
    private String cardHolder;
    private String cardNumber;
    private double balance;

    public CreditCard()
    {
        this.prefix = "Unknown";
        this.cardHolder = "Unknown Holder";
        this.cardNumber = "Unknown Card Number";
    }

    public CreditCard(String prefix, String cardHolder, String cardNumber, double balance)
    {
        this.prefix = prefix;
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getPrefix() {
        return prefix;
    }

    public void getCreditCardInfo()
    {
        System.out.println("Credit Card Holder is: " + this.cardHolder);
        System.out.println("Credit Card Number is: " + this.cardNumber);
        System.out.println("Credit Card Balance is: " + this.balance);
    }
}