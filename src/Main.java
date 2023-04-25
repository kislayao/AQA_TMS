import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        System.out.print("");
        System.out.println();

        // new line - symbol, \n

        System.out.print("Please, enter your name: " + "Olga Kislaya");
        System.out.println();
        System.out.println("Please, enter your surname: ");
        System.out.println("Please, enter your age: ");

        System.out.println("Let's calculate sum of 5 + 10: " + (5 + 10));
        System.out.println("Olga" + " " + "Kislaya" +
                ". Welcome to my First " +
                "Lesson to...........");

        // This is an example comment for Git
        System.out.println();
        System.out.print("Please, enter your name & surname: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        // New Comment

        String name = "t123";
        int age = 44;
        double weight = 88.8;
        char symbol = 'A';

    }
}