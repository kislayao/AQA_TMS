import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // Homework updates

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

        String name = "test123";
        int age = 17;
        double weight = 88.88;
        char symbol = 'A';

        // New HT
        //Task number 1
        System.out.println("    |    |");
        System.out.println("____|____|____");
        System.out.println("    |    |");
        System.out.println("____|____|____");
        System.out.println("    |    |");
        System.out.println("    |    |");

        //Task number 2
        String tree =
                "        *\n" +
                "       ***\n" +
                "      *****\n" +
                "     *******\n" +
                "    *********\n";
        System.out.println(tree);
    }
}