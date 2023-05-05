import java.util.Scanner;
public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        getHumanParameters();
        convertCharToInt();
        calculationOfBMI();

        scanner.close();
    }

    // task 1
    public static void getHumanParameters()
    {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter your age: ");
        String age = scanner.nextLine();
        System.out.print("Enter your height: ");
        String height = scanner.nextLine();
        System.out.print("Enter your weight: ");
        String weight = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }

    // task 2
    public static void convertCharToInt()
    {
        System.out.print("Enter any 1 symbol: ");
        char symbol = scanner.next().charAt(0);
        System.out.println(symbol + " - " + (int) symbol);
    }

    // task 3
    public static void calculationOfBMI()
    {
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();
        double BMI = weight/(height*height);
        System.out.println("BMI result: " + BMI);
    }
}