package PhoneTask;

public class Main {

    public static void main(String[] args) {

        // Task 1
        Phone person1 = new Phone("+45-663-444-555", "iPhone X", 250.5);
        Phone person2 = new Phone("+48-023-414-000", "Samsung Galaxy");
        Phone person3 = new Phone("+375(29)-689-123-456", "Real Me", 500.4);

        person1.getAllInfo();
        System.out.println();
        person2.getAllInfo();
        System.out.println();
        person3.getAllInfo();
        System.out.println();

        person1.receiveCall("Anna");
        System.out.println();
        person2.receiveCall("Alex", "+48-665-669-333");
        System.out.println();
        person3.sendMessage("+48-661-325-466", "+375-29-333-333-222");
        System.out.println("\n");

    }
}