package MainTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Methods doc = new Methods();
        System.out.print("Please, enter document number in the dddd-lll-dddd-lll-dldl format " +
                "(where d - digit, l - letter): ");
        String documentNumber = doc.scanner().next();

        doc.getTwoFirstDigitBlocks(documentNumber);
        doc.replaceLettersWithAsterisk(documentNumber);
        doc.getLettersInLowerCase(documentNumber);
        doc.getLettersInUpperCase(new StringBuilder(documentNumber));
        doc.checkForAbcSequence(documentNumber);
        doc.checkIfDocumentNumberBeginsWith555(documentNumber);
        doc.checkIfDocumentNumberEndsWith1a2b(documentNumber);

    }


}