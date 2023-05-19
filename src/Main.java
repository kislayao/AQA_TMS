public class Main {

    public static void main(String[] args) {

        CreditCard pko = new CreditCard("Volha Kislaya", "4566-7899-1233-1599", 1500);
        CreditCard stander = new CreditCard("Vitaly Kisly", "7500-5500-1111-1709", 3500);
        CreditCard pekao = new CreditCard("Mishka Kot", "1111-2222-3333-4444", 100.33);

        System.out.println();
        System.out.println("Initial cards info:");
        System.out.println();

        pko.getAccountInfo();
        stander.getAccountInfo();
        pekao.getAccountInfo();

        System.out.println("Cards info after changes:");
        System.out.println();

        // Increase card balance
        pko.setCardBalance(increaseCardBalance(pko.getCardBalance(),1200));
        printCardInfo(pko.getCardHolder(), pko.getCardNumber(), pko.getCardBalance());

        stander.setCardBalance(increaseCardBalance(stander.getCardBalance(),4030.2));
        printCardInfo(stander.getCardHolder(), stander.getCardNumber(), stander.getCardBalance());

        // Reduce card balance
        pekao.setCardBalance(reduceCardBalance(pekao.getCardBalance(), 200));
        printCardInfo(pekao.getCardHolder(), pekao.getCardNumber(), pekao.getCardBalance());
    }

    public static double increaseCardBalance(double cardBalance, double sumToAdd){
        cardBalance += sumToAdd;
        return cardBalance;
    }

    public static double reduceCardBalance(double cardBalance, double sumToSubtract){
        cardBalance -= sumToSubtract;
        return cardBalance;
    }

    // alternative to getAccountInfo(){} constructor
    public static void printCardInfo(String cardHolder, String cardNumber, double cardBalance){
        System.out.println("Card holder is: " + cardHolder);
        System.out.println("Card number is: " + cardNumber);
        System.out.println("Card balance is: " + cardBalance);
        System.out.println();
    }
}