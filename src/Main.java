import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // One dimensional arrays

        // Task 0 - Program for checking whether entered number exists in the array or not
        checkNumberInArray();
        System.out.println();

        // Task 1 - Program for deleting entered number from array
        deleteNumberFromArray();
        System.out.println();

        // Task 2 - Program for creating array from random numbers
        createRandomArray();
        System.out.println();

        // Task 3 - Program for comparing average numbers of 2 arrays
        compareAvgNumbersOfArrays();
        System.out.println();

        // Additional tasks

        // Task 4 - Program for creating array of limited elements and creating another array of even numbers of the first one
        createArrays();
        System.out.println();

        // Task 5 - Program for replacing every odd element of array with 0
        replacingOddElement();
        System.out.println();

        // Task 6 - Array with sorted names
        sortNames();
        System.out.println();

        // Task 7 - Bubble sorting
        getBubbleSorting();
        System.out.println();



    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void checkNumberInArray() {

        int[] array = new int[]{1, 0, 3, 98, 5};
        System.out.println("Array:");
        for (int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println();
        System.out.print("Please, enter number: ");
        int enteredNumber = scanner().nextInt();

        for (int index = 0; index < array.length; index++) {
            if (array[index] == enteredNumber) {
                System.out.println("Entered number present in the array");
                break;
            }
            if (index == array.length - 1)
                System.out.println("There is no entered number in the array");
        }
    }

    public static void deleteNumberFromArray() {

        int[] array = new int[]{1, 3, 3, 98, 5};

        // printing initial array
        System.out.println("Initial array: ");
        for (int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println();

        System.out.print("Please, enter number: ");
        int enteredNumber = scanner().nextInt();

        int match = 0; // variable for counting matching elements
        // counting matching elements
        for (int index = 0; index < array.length; index++) {
            if (array[index] == enteredNumber){
                match++;
            }
        }

        int [] arrayWithoutEnteredNumber = new int [array.length-match];
        int index2 = 0; // variable for counting elements of the array without entered number
        for (int index = 0; index < array.length; index++){
            if (!(array[index] == enteredNumber)){
                arrayWithoutEnteredNumber[index2] = array[index];
                index2++;
            }
        }

        // print array without entered number
        System.out.println("Array without entered number:");
        for (int index = 0; index < arrayWithoutEnteredNumber.length; index++){
            System.out.print(arrayWithoutEnteredNumber[index] + " ");
        }
        System.out.println();
    }

    public static void createRandomArray() {
        int max;
        int min;
        int sum = 0;
        double avg = 0.0;

        System.out.print("Please, enter number of elements in the array: ");
        int enteredNumber = scanner().nextInt();

        // create array
        int [] array = new int[enteredNumber];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int)(Math.random()*(enteredNumber+1));
            if (array[index]%2 == 0){
            }
        }

        System.out.print("Created array: ");
        // print array
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();

        // get max number
        max = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
        System.out.println("Max array number: " + max);

        // get min number
        min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        System.out.println("Min array number: " + min);

        // get average number
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }
        avg = (double) sum / array.length;
        System.out.println("Average array number: " + avg);
    }

    public static void compareAvgNumbersOfArrays() {
        int sum1 = 0;
        int sum2 = 0;
        double avg1 = 0;
        double avg2 = 0;

        int[] array1 = new int[]{1, 0, 4, 98, 5};
        int[] array2 = new int[]{1, 0, 3, 98, 5};

        System.out.print ("Array 1: ");
        for (int index = 0; index < array1.length; index++) {
            System.out.print(array1[index] + " ");
        }

        System.out.println();

        System.out.print("Array 2: ");
        for (int index = 0; index < array2.length; index++) {
            System.out.print(array2[index] + " ");
        }
        System.out.println();

        // get average number of array 1
        for (int index = 0; index < array1.length; index++) {
            sum1 += array1[index];
        }
        avg1 = (double) sum1 / array1.length;

        // get average number of array 2
        for (int index = 0; index < array2.length; index++) {
            sum2 += array2[index];
        }
        avg2 = (double) sum2 / array2.length;

        String result = (avg1 > avg2) ? "Average number of array 1 is more" : (avg1 < avg2) ?
                "Average number of array 2 is more" : "Average numbers of arrays are equal";
        System.out.println(result);
    }

    public static void createArrays() {

        System.out.print("Please, enter number which is more than 5 and less or equals to 10: ");
        int enteredNumber = scanner().nextInt();

        while (enteredNumber <= 5 || enteredNumber >10) {
            if (enteredNumber <= 5 || enteredNumber > 10) {
                System.out.println("Please enter number from  specified range");
                System.out.print("Please, enter number which is more than 5 and less or equals to 10: ");
                enteredNumber = scanner().nextInt();
            }
        }

        int [] array = new int [enteredNumber];
        Random ran = new Random();

        int evenNums = 0; // variable for counting even numbers

        // creating initial array and counting even numbers
        for (int index = 0; index < array.length; index++) {
            array[index] = ran.nextInt();
            if (array[index]%2 == 0){
                evenNums++;
            }
        }

        // printing initial array
        System.out.println("Created array:");
        for (int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println();


        // creating array of even nums
        int [] arrayOfEvenNums = new int [evenNums];
        int index2 = 0; // variable for counting elements of array of even nums
        for (int index = 0; index < array.length; index++){
            if (array[index]%2 == 0){
                arrayOfEvenNums[index2] = array[index];
                index2++;
            }
        }

        // printing array of even nums
        System.out.println("An array of even numbers of the created array:");
        for (int index = 0; index < arrayOfEvenNums.length; index++){
            System.out.print(arrayOfEvenNums[index] + " ");
        }
        System.out.println();
    }

    public static void replacingOddElement(){

        int [] array = new int [] {1, 5, 7, -55, -64, 1, 6};
        System.out.println("Initial array:");

        for (int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println();

        for (int index = 0; index < array.length; index++){
           if (index%2 == 1){
               array[index] = 0;
           }
        }

        System.out.println("Array with 0 for odd elements: ");
        for (int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void sortNames(){
        String[] names = new String[] {"Olga", "Vitaly", "Misha", "Tatsiana", "Alexey", "Maxim"};
        System.out.println("Initial array: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted array: " + Arrays.toString(names));
    }

    public static void getBubbleSorting(){
        int [] array = new int [] {1, 88, 7, 55, 64, 1, 6};

        System.out.println("Initial array: " + Arrays.toString(array));

        for (int index1 = 0; index1 < array.length; index1++){
            for (int index2 = 0; index2 < array.length - 1 - index1; index2++){
                if(array[index2] > array[index2 + 1]){
                    int var = array[index2];
                    array[index2] = array[index2 + 1];
                    array[index2 + 1] = var;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}