package saikia.priyam.smart.algos;

public class Day3 {
    public static void main(String[] args) {
        System.out.print("Hello World");
        System.out.println();
        reverseString("mamam");
        reverseString("Priyam Saikia");
        reverseString("Mamam");
        isPalindrome("Hallah");
        isPalindrome("Halpah");
    }

    static void isPalindrome(String inputString) {
        System.out.println();
        String string = inputString.toLowerCase();
        int len = string.length();
        boolean isPalindromeFlag = true;
        for (int i = 0; i < (len / 2) + 1; i++) {
            if (string.charAt(i) != string.charAt(len - i - 1)) {
                isPalindromeFlag = false;
                break;
            }
        }
        if (isPalindromeFlag) {
            System.out.print("Yes, " + inputString + " is a palindrome");
        } else {
            System.out.print("No, " + inputString + " is not a palindrome");
        }
    }

    static void reverseString(String inputString) {
        System.out.println();
        char[] charArray = inputString.toCharArray();
        StringBuilder outputString = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            outputString.append(charArray[i]);
        }

        System.out.print("Reverse of " + inputString + " is " + outputString);
    }
}
