import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // One dimensional arrays

        // Task 0 - Program for checking whether entered number exists in the array or not
    //        checkNumberInArray();

        // Task 1 - Program for deleting entered number from array
        deleteNumberFromArray();



    }

    public static Scanner scanner()
    {
        return new Scanner(System.in);
    }

    public static void checkNumberInArray()
    {
        System.out.print("Please, enter number: ");
        int enteredNumber = scanner().nextInt();

        int[] array = new int[] { 1, 0, 3, 98, 5 };

        for (int index=0; index < array.length; index++)
        {
            if (array[index] == enteredNumber){
                System.out.println("Entered number is in the array");
                break;
            }
            if (index == array.length-1)
            System.out.println("There is no entered number in the array");
        }
    }

    public static void deleteNumberFromArray()
    {
        System.out.print("Please, enter number: ");
        int enteredNumber = scanner().nextInt();

        int[] array = new int[] { 1, 0, 3, 98, 5 };
        int[] newArray;

        for (int index=0; index < array.length; index++)
        {
            if (array[index] == enteredNumber){
                int [] copy = new int[array.length-1];
           }

        }


    }



}