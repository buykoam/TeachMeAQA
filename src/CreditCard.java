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
    public void getSumBalance() {
        System.out.print("Enter sum ");
        Scanner console = new Scanner(System.in);
        {
            balance += console.nextInt();
            System.out.println("Credit Card Holder is " + this.cardHolder);
            System.out.println("Credit Card Number is " + this.cardNumber);
            System.out.print("Credit Card Balance is " + balance);
        }
    }
    public void getWithdrawalOfMoney()
    {
        System.out.print("Enter amount ");
        Scanner input = new Scanner(System.in);
         {
             balance -= input.nextInt();
            System.out.println("Credit Card Holder is " + this.cardHolder);
            System.out.println("Credit Card Number is " + this.cardNumber);
            System.out.print("Credit Card Balance is " + balance);
             balance--;
        }
    }
}
