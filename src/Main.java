import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Part 1 - Flow Operators

        // Task 1 - Program for displaying the name of the time of the year by the number of the month
        // switch-case operator
        getSeasonNameSwitch(new Scanner(System.in));
        System.out.println();

        // Task 2 - Program for displaying the name of the time of the year by the number of the month
        // if-else-if operator
        getSeasonNameIf(new Scanner(System.in));
        System.out.println();

        // Task 3 - Program for determining whether entered number is even or odd
        getNumberType(new Scanner(System.in));
        System.out.println();

        // Task 4 - Program for determining weather conditions
        getWeatherTemperature(new Scanner(System.in));
        System.out.println();

        // Task 5 - Program for determining the color of the rainbow
        getRainbowColor(new Scanner(System.in));
        System.out.println();

        // Part 2 - Loops

        // Task 1 - Program for getting odd numbers
        getOddNumbers();
        System.out.println();

        // Task 2 - Program for getting numbers from 5 to 1
        getDecreasingNumbers();
        System.out.println();

        // Task 3 - Program for getting sum of numbers from1 to entered one
        getSum(new Scanner(System.in));
        System.out.println();

        //Task 4 - Program for getting 7 14 21 ... 98 sequence
        getSequenceOfNumbers7();
        System.out.println();

        // Task 5 - Program for getting 10 first numbers of 0 -5 -10 ... sequence
        getSequenceOfNumbers5();
        System.out.println();

        // Task 6 - Program for getting numbers squared
        getNumbersSquared();
        System.out.println();

        //Additional tasks

        // Task 1 - Program for getting 10 first Fibonacci numbers
        getFibonacciNumbers();
        System.out.println();

        // Task 2 - Program for getting final deposit sum
        getFinalDepositSum(new Scanner(System.in));
        System.out.println();

        // Task 3 - Program for getting multiplication table
        getMultiplicationTable();
    }

    public static void Scanner(){
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }

    public static void getSeasonNameSwitch(Scanner scanner)
    {
        System.out.print("Please, enter month number: ");
        int seasonNumber = scanner.nextInt();

        switch(seasonNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Entered number the month corresponds to the time of the year Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Entered number the month corresponds to the time of the year Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Entered number the month corresponds to the time of the year Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Entered number the month corresponds to the time of the year Autumn");
                break;
            default:
                System.out.println("No month corresponds to entered number");
                break;
        }
    }

    public static void getSeasonNameIf(Scanner scanner)
    {
        System.out.print("Please, enter month number: ");
        int seasonNumber = scanner.nextInt();

        if (seasonNumber == 12 || seasonNumber == 1 || seasonNumber == 2) {
            System.out.println("Entered number the month corresponds to the time of the year Winter");
        } else if (seasonNumber == 3 || seasonNumber == 4 || seasonNumber == 5) {
            System.out.println("Entered number the month corresponds to the time of the year Spring");
        } else if (seasonNumber == 6 || seasonNumber == 7 || seasonNumber == 8) {
            System.out.println("Entered number the month corresponds to the time of the year Summer");
        } else if (seasonNumber == 9 || seasonNumber == 10 || seasonNumber == 11) {
            System.out.println("Entered number the month corresponds to the time of the year Autumn");
        } else {
            System.out.println("No month corresponds to entered number");
        }
    }

    public static void getNumberType(Scanner scanner)
    {
        System.out.print("Please, enter any number: ");
        int number = scanner.nextInt();

        if (number%2 == 0){
            System.out.print("Entered number is even");
        } else {
            System.out.print("Entered number is odd");
        }
        System.out.println();
    }

    public static void getWeatherTemperature(Scanner scanner)
    {
        System.out.print("Please, enter temperature value: ");
        int temperature = scanner.nextInt();

        if (temperature > -5){
            System.out.print("The weather is worm");
        }
        if (temperature <= -5 && temperature > -20) {
            System.out.print("The weather is normal");
        }
        if (temperature <= -20)  {
            System.out.print("The weather is cold");
        }
        System.out.println();
    }

    public static void getRainbowColor(Scanner scanner)
    {
        System.out.print("Please, enter number of color on rainbow: ");
        int rainbowColour = scanner.nextInt();

        switch (rainbowColour){
            case 1:
                System.out.println("It's red color");
                break;
            case 2:
                System.out.println("It's orange color");
                break;
            case 3:
                System.out.println("It's yellow color");
                break;
            case 4:
                System.out.println("It's green color");
                break;
            case 5:
                System.out.println("It's blue color");
                break;
            case 6:
                System.out.println("It's indigo color");
                break;
            case 7:
                System.out.println("It's violet color");
                break;
            default:
                System.out.println("There are only 7 colors in rainbow. Please, check entered number");
                break;
        }
    }

    public static void getOddNumbers()
    {
        System.out.print("Sequence of odd numbers from 1 to 99: ");
        for (int number = 1; number <= 99; number++)
        {
            System.out.print(number + " ");
            number ++;
        }
        System.out.println();
    }

    public static void getDecreasingNumbers()
    {
        System.out.print("Decreasing sequence of numbers from 5 to 1: ");
        for (int number = 5; number >= 1; number--)
        {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void getSum(Scanner scanner)
    {
        System.out.print("Please, enter any positive number: ");
        int enteredNumber = scanner.nextInt();
        int sum = 0;

        for (int counter = 1; counter <= enteredNumber; counter++)
        {
            sum += counter;
        }
        System.out.println("The sum of numbers from 1 to entered one equals to " + sum);
    }

    public static void getSequenceOfNumbers7()
    {
        int number = 7;

        System.out.print("Sequence of numbers with step equals to 7: ");
        while (number <=98){
            System.out.print(number + " ");
            number += 7;
        }
        System.out.println();
    }

    public static void getSequenceOfNumbers5()
    {
        int counter = 1;
        int number = 0;
        System.out.print("Sequence of numbers with step equals to -5: ");

        while (counter <=10){
            System.out.print(number + " ");
            number -= 5;
            counter++;
        }
        System.out.println();
    }

    public static void getNumbersSquared()
    {
        System.out.print("Sequence of squars of numbers from 10 to 20: ");
        for (int counter = 10; counter <=20; counter++)
        {
            System.out.print(counter*counter + " ");
        }
        System.out.println();
    }

    public static void getFibonacciNumbers()
    {
        int number1 = 0;
        int number2 = 1;
        int sum;
        System.out.print("10 first numbers of Fibonacci sequence: " + number1 + " " + number2 + " ");

        for (int counter = 1; counter <= 8; counter++)
        {

            sum = number1 + number2;
            number1 = number2;
            number2 = sum;

            System.out.print(sum + " ");
        }
        System.out.println();
    }

    public static void getFinalDepositSum(Scanner scanner)
    {
        System.out.print("Please, enter initial deposit sum: ");
        float depositSum = scanner.nextFloat();
        System.out.print("Please, enter amount of months: ");
        int month = scanner.nextInt();
        float rate = 0.07f;

        for (int counter = 1; counter <= month; counter++)
        {
            depositSum += depositSum*rate;
        }
        System.out.println("Deposit after " + month + " months will be equals to " + depositSum);
    }

    public static void getMultiplicationTable()
    {
        System.out.println("Multiplication table:");
        for (int counter1 = 1; counter1<=10; counter1++)
        {
            for (int counter2 = 1; counter2<=10; counter2++)
            {
                System.out.println(counter1 + " * " + counter2 + " = " + counter1*counter2);
            }
            System.out.println();
        }
    }
}