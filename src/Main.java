public class Main {

    public static void main(String[] args) {

        CreditCard pko = new CreditCard("Volha Kislaya", "4566-7899-1233-1599", 1500);
        CreditCard stander = new CreditCard("Vitaly Kisly", "7500-5500-1111-1709", 3500);
        CreditCard pekao = new CreditCard("Mishka Kot", "1111-2222-3333-4444", 100);

        System.out.println();
        System.out.println("Initial cards info:");
        System.out.println();

        pko.getCardInfo();
        stander.getCardInfo();
        pekao.getCardInfo();

        System.out.println("Cards info after changes:");
        System.out.println();

        // Increase card balance
        pko.increaseCardBalance(2150.11);
        pko.getCardInfo();

        stander.increaseCardBalance(5123.2);
        stander.getCardInfo();

        // Reduce card balance
        pekao.reduceCardBalance(144.2);
        pekao.getCardInfo();
    }
}