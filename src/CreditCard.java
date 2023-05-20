import java.util.Scanner;

class CreditCard {
    private String cardNumber;
    private double balance;
    private String cardHolder;

    public CreditCard()
    {
        this.cardHolder = "Unknown Holder";
        this.cardNumber = "Unknown Card Number";
    }

    public CreditCard (String cardHolder, String cardNumber, double balance)
    {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }
    public void getCardCreditInfo()
    {
        System.out.println("Credit Card Holder is " + this.cardHolder);
        System.out.println("Credit Card Number is " + this.cardNumber);
        System.out.println("Credit Card Balance is " + this.balance);
    }

    public static void getBalance()
    {
            Scanner amount = new Scanner(System.in);
            System.out.println("Enter sum ");
            double number = amount.nextDouble();
            System.out.println("Thanks! You entered sum " + number);
        }
}
