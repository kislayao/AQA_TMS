package AdditionalTasks;

public class MethodsForAdditionalTasks {

    public void getTheShortestAndTheLongestWords(String line) {

        String[] wordsArray = line.split(" ");
        int max = 0;
        int min = 100000000;
        int countMax = 0;
        int countMin = 0;

        for (int i = 0; i < wordsArray.length; i++) {
            if (max < wordsArray[i].length()) {
                max = wordsArray[i].length();
            }
            if (min > wordsArray[i].length()) {
                min = wordsArray[i].length();
            }
        }

        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() == max) {
                countMax++;
            }
            if (wordsArray[i].length() == min) {
                countMin++;
            }
        }

        String[] maxArray = new String[countMax];
        String[] minArray = new String[countMin];
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() == max) {
                maxArray[indexMax] = wordsArray[i];
                indexMax++;
            }
            if (wordsArray[i].length() == min) {
                minArray[indexMin] = wordsArray[i];
                indexMin++;
            }
        }
        System.out.println("Min word: " + minArray[minArray.length - 1]);
        System.out.println("Max word: " + maxArray[maxArray.length - 1]);
    }
}
