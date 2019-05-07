package saikia.priyam.smart.algos;

public class Day6 extends CommonBase {
    static String TAG = Day6.class.getSimpleName();

    public static void main(String[] args) {
        print("Hello World on " + TAG);
        countCharacterOccurenceWithoutLoop("Priyam Saikia", 'a');
    }

    static void countCharacterOccurenceWithoutLoop(String inputString, char c) {
        if (inputString == null) {
            return;
        }
        StringBuilder localString = new StringBuilder(inputString);
        int count = inputString.length() -
                localString.toString().replace(c + "", "").length();
        print("The string " + inputString + " has " + c + " " + count + " times");
    }
}
