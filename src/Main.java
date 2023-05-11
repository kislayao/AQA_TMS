import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // One dimensional arrays

        // Task 0 - Program for checking whether entered number exists in the array or not
//            checkNumberInArray();
        System.out.println();

        // Task 1 - Program for deleting entered number from array
//        deleteNumberFromArray();
        System.out.println();

        //Task 2 - Program for creating array from random numbers
//        createRandomArray();
        System.out.println();

        // Task 3 - Program for comparing average numbers of 2 arrays
//        compareAvgNumbersOfArrays();
        System.out.println();

        // Additional tasks

        // Task 4 - Program for creating array of limited elements and creating another array of even numbers of the first one




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

//        for (int index=0; index < array.length; index++)
//        {
//            if (array[index] == enteredNumber){
//                int [] copy = new int[array.length-1];
//                System.arraycopy(array, 0, copy, 0, index);
//                System.arraycopy(array, index+1, copy, index, array.length-index-1);
//                System.out.print(copy[index]);
//           }
//
//
//        }





    }

    public static void createRandomArray()
    {
        double max;
        double min;
        double sum = 0;

        System.out.print("Please, enter number of elements in the array: ");
        int enteredNumber = scanner().nextInt();

        // create array
        double [] array = new double [enteredNumber];
        for (int index = 0; index < array.length; index++){
            array[index] = Math.random();
        }

        // print array
        for (int index = 0; index < array.length; index++){
            System.out.println(array[index]);
        }

        // get max number
        max = array[0];
        for (int index = 0; index < array.length; index++){
            if (array[index]>max)
            {
                max = array[index];
            }
        }
        System.out.println("Max number: " + max);

        // get min number
        min = array[0];
        for (int index = 0; index < array.length; index++){
            if (array[index]<min)
            {
                min = array[index];
            }
        }
        System.out.println("Min number: " + min);

        // get average number
        for (int index = 0; index < array.length; index++){
            sum += array[index];
        }
        System.out.println("Average number: " + sum / (double) array.length);
    }

    public static void compareAvgNumbersOfArrays()
    {
        int sum1 = 0;
        int sum2 = 0;
        double avg1 = 0;
        double avg2 = 0;

        int[] array1 = new int[] { 1, 0, 3, 98, 5 };
        int[] array2 = new int[] { 1, 0, 4, 98, 5 };

        for (int index = 0; index < array1.length; index++)
        {
            System.out.print(array1[index] + " ");
        }

        System.out.println();

        for (int index = 0; index < array2.length; index++)
        {
            System.out.print(array2[index] + " ");
        }
        System.out.println();

        // get average number
        for (int index = 0; index < array1.length; index++){
            sum1 += array1[index];
        }
        avg1 = sum1 / (double) array1.length;

        for (int index = 0; index < array2.length; index++){
            sum2 += array2[index];
        }
        avg2 = sum2 / (double) array2.length;

        String result = (avg1 > avg2) ? "Average number of array 1 is more" : (avg1 < avg2) ?
                "Average number of array 2 is more" : "Average numbers of arrays are equal";
        System.out.println(result);
    }



}