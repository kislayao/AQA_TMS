import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Multiple arrays homework

//        // Task 0 - Crate 3-dimensional array and increase each element
//        increase3DimensionalArray();
//        System.out.println();

//        // Task 1 - Create chess board
//        createChessBoard();
//        System.out.println();
        // Additional tasks

         //Task 2 - Multiply 2 arrays

//        System.out.println();

//        // Task 3 - Get sum of all the elements of 2-dimensional array
//        getSumOfTheElements();
//        System.out.println();
//
//        // Task 4 - Show diagonals of a two-dimensional array
//        showArrayDiagonals();
//        System.out.println();

        // Task 5 - Sort array elements
        sort2DimensionalArrayElements();



    }

    public static Scanner scanner (){
        return new Scanner(System.in);
    }

    public static void show3DimensionalArray(int array[][][]){
        for (int outter = 0; outter < array.length; outter++){
            for (int row = 0; row < array[outter].length; row++){
                for (int column = 0; column < array[outter][row].length; column++){
                    System.out.print(array[outter][row][column] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void show2DimensionalArray(String array[][]){
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void show2DimensionalArray(int array[][]){
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void increase3DimensionalArray(){

        System.out.println("Task 0");

        int [][][] array = new int [][][]{
                {
                        {1,3,5},
                        {2,6,9},
                        {6,9,10}
                }
        };
        System.out.println("This is initial array:");
        show3DimensionalArray(array);
        System.out.println();
        System.out.print("Please, enter any number to increase each element of the array: ");
        int enteredNumber = scanner().nextInt();

        for (int outter = 0; outter < array.length; outter++){
            for (int row = 0; row < array[outter].length; row++){
                for (int column = 0; column < array[outter][row].length; column++){
                    array[outter][row][column] += enteredNumber;
                }
            }
        }
        System.out.println(" ");
        System.out.println("This is new array:");
        show3DimensionalArray(array);
    }

    public static void createChessBoard(){

        System.out.println("Task 1");
        String[][] array = new String[8][8];
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                if ((row%2 == 0 && column%2==0) || (row%2 != 0 && column%2 != 0)){
                    array[row][column] = "W";
                } else
                    array[row][column] = "B";
            }
        }
        show2DimensionalArray(array);
    }

    public static void getSumOfTheElements(){
        System.out.println("Task 3");
        int[][] array = new int [][]{
                {1, 3, 5},
                {4, 3, 6, 1}
        };
        System.out.println("This is array:");
        show2DimensionalArray(array);
        int sum = 0;
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                sum += array[row][column];
            }
        }
        System.out.println("Sum of all the array elements equals to " + sum);
    }

    public static void showArrayDiagonals(){
        System.out.println("Task 4");
        int counter = 1;
        int[][] array = new int [3][3];
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                    array[row][column] = counter++ ;
            }
        }

        System.out.println("This is array:");
        show2DimensionalArray(array);

        // main diagonal
        System.out.print ("This is main diagonal of the array: ");
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
               if (row == column){
                   System.out.print(array[row][column] + " ");
               }
            }
        }
        System.out.println();
        // side diagonal
        System.out.print ("This is side diagonal of the array: ");
        for (int row = (array.length - 1); row >= 0; row--){
            for (int column = (array[row].length - 1); column >= 0; column--){
                if ((row+column) == (array.length - 1)){
                    System.out.print(array[row][column] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void sort2DimensionalArrayElements(){
        System.out.println("Task 5");
        Random randomNumber = new Random();
        int [][] array = new int [4][3];

        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                array[row][column] = randomNumber.nextInt(1, 11) ;
            }
        }
        System.out.println("This is initial array:");
        show2DimensionalArray(array);

        for (int index = 0; index < array.length; index++) {
            for (int row = 0; row < array[index].length; row++) {
                for (int column = 0; column < array[index].length - 1 - row; column++) {
                    if (array[row+1][column] > array[row][column + 1]) {
                        int var = array[row+1][column];
                        array[column] = array[column + 1];
                        array[row+1][column + 1] = var;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("This is sorted array:");
        show2DimensionalArray(array);

    }


}