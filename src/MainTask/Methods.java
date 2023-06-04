package MainTask;

import java.util.Scanner;

public class Methods {


    public Methods (){};

    public static Scanner scanner (){
        return new Scanner(System.in);
    }
    public static void getTwoFirstDigitBlocks(String documentNumber){
        System.out.println(documentNumber.substring(0, 4) + documentNumber.substring(9,13));
    }

    public static void replaceLettersWithAsterisk(String documentNumber){
        for (int index = 0; index <= (documentNumber.length()-1); index++){
            if (Character.isLetter(documentNumber.charAt(index)) && index<18)
            {
                System.out.print("*");
            } else
            System.out.print(documentNumber.charAt(index));
        }
        System.out.println();
    }

    public static void getLettersInLowerCase(String documentNumber){
        for (int index = 0; index <= (documentNumber.length()-1); index++){
            if (Character.isLetter(documentNumber.charAt(index)))
            {

                System.out.print(Character.toLowerCase(documentNumber.charAt(index)));

                if  (index < documentNumber.length()-2 && !Character.isLetter(documentNumber.charAt(index+1)))
                {
                    System.out.print("/");
                }

            }
        }
        System.out.println();
    }

    public static void getLettersInUpperCase(StringBuilder documentNumber){
        System.out.print("Letters: ");
        for (int index = 0; index <= (documentNumber.length()-1); index++){
            if (Character.isLetter(documentNumber.charAt(index)))
            {

                System.out.print(Character.toUpperCase(documentNumber.charAt(index)));

                if  (index < documentNumber.length()-2 && !Character.isLetter(documentNumber.charAt(index+1)))
                {
                    System.out.print("/");
                }

            }
        }
        System.out.println();
    }

    public static void checkForAbcSequence(String documentNumber){
        if (documentNumber.toLowerCase().contains("abc")){
            System.out.println("There is 'abc' sequence in the document number");
        } else {
            System.out.println("There is NO 'abc' sequence in the document number");
        }
    }

    public static void checkIfDocumentNumberBeginsWith555(String documentNumber){
        if (documentNumber.substring(0, 3).equals("555")){
            System.out.println("Document number begins with 555");
        }
        else
            System.out.println("Document number doesn't begin with 555");
    };

    public static void checkIfDocumentNumberEndsWith1a2b(String documentNumber){

        if (documentNumber.substring(documentNumber.length()-4, documentNumber.length()).equals("1a2b")){
            System.out.println("Document number ends with 1a2b");
        }
        else
            System.out.println("Document number doesn't end with 1a2b");
    };
















}
