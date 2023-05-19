public class CreditCard {
    private String cardHolder;
    private String cardNumber;
    private double cardBalance;

    public CreditCard(){
        this.cardHolder = "Unknown Card Holder";
        this.cardNumber = "Unknown Card Number";
    }

    public CreditCard (String cardHolder, String cardNumber, double cardBalance){
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }

    public void getCardInfo(){
        System.out.println("Card holder is: " + this.cardHolder);
        System.out.println("Card number is: " + this.cardNumber);
        System.out.println("Card balance is: " + this.cardBalance);
        System.out.println();
    }

    public void increaseCardBalance (double sumToAdd){
        this.cardBalance += sumToAdd;
    }

    public void reduceCardBalance (double sumToSubtract){
        this.cardBalance -= sumToSubtract;
    }
}
