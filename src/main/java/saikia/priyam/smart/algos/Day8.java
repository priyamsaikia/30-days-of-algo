package saikia.priyam.smart.algos;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Day8 {
    private static final String TAG = Day8.class.getSimpleName();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        hackerRankDay10();
    }

    private static void hackerRankDay10() {
        //decimal to binary
        /*
        Given a base- 10 integer, n, convert it to binary (base-2).
        Then find and print the base- 10 integer denoting
        the maximum number of consecutive 1's in n's binary representation.
         */
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        StringBuilder reverseBinaryString = new StringBuilder();
        hackerRankDay10BinaryDivision(n, reverseBinaryString);
        reverseBinaryString.reverse();
//        System.out.println("Binary of " + n + " is " + reverseBinaryString);
        char[] binaryStringChars = reverseBinaryString.toString().toCharArray();
        int zeroCountIndex = 1, oneCountIndex = 1;
        int consecutiveZeroCountMax = 1, consecutiveOneCountMax = 1;
        for (int i = 0; i < binaryStringChars.length - 1; i++) {
            if (binaryStringChars[i] == '1' && binaryStringChars[i + 1] == '1') {
                oneCountIndex++;
                if (consecutiveOneCountMax < oneCountIndex) {
                    consecutiveOneCountMax = oneCountIndex;
                }
            } else {
                oneCountIndex = 1;
            }
            if (binaryStringChars[i] == '0' && binaryStringChars[i + 1] == '0') {
                zeroCountIndex++;
                if (consecutiveZeroCountMax < zeroCountIndex) {
                    consecutiveZeroCountMax = zeroCountIndex;
                }
            } else {
                zeroCountIndex = 1;
            }
        }
        System.out.println(consecutiveOneCountMax);
//        System.out.println("Consecutive 0 count = " + consecutiveZeroCountMax);
        scanner.close();
    }

    private static String hackerRankDay10BinaryDivision(int n, StringBuilder binaryString) {
        int remainder = n % 2;
        binaryString.append(remainder);
        // System.out.println("n = " + n + " quotient = " + n / 2 + " remainder = " + remainder);

        n = n / 2;
        if (n > 1) {
            hackerRankDay10BinaryDivision(n, binaryString);
        } else {
            binaryString.append(n);
//            System.out.println("final = " + binaryString);
        }
        return remainder + "";
    }

    private static void hackerRankDay9() throws IOException {
        //factorial
        /*
        Write a factorial function that takes a positive integer, N as a parameter
        and prints the result of N factorial).
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = hackerRankDay9Factorial(n);
        System.out.println(result);
        scanner.close();
    }

    private static int hackerRankDay9Factorial(int n) {
        if (n > 1) {
            n = n * hackerRankDay9Factorial(n - 1);
        }
        return n;
    }

    private static void hackerRankDay8() {
        /*
        Given 'n' names and phone numbers, assemble a phone book that maps friends' names
        to their respective phone numbers.
        You will then be given an unknown number of names to query your phone book for.
        For each 'name' queried, print the associated entry from your phone book on a new line
        in the form name=phoneNumber; if an entry for 'name' is not found,
        print Not found instead.

        Note: Your phone book should be a Dictionary/Map/HashMap data structure.
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();

    }

    private static void hackerRankDay7() {
        //arrays
        /*
        Given an array, A, of N integers, print A's elements in reverse order
        as a single line of space-separated numbers.
         */
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int[] inputs = new int[c];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextInt();
        }

        for (int i = inputs.length - 1; i >= 0; i--) {
            System.out.print(inputs[i] + " ");
        }
    }

    private static void hackerRankDay6() {
        //even odd indexed Strings
        Scanner scanner = new Scanner(System.in);
        int stringCount = scanner.nextInt();
        String[] inputs = new String[stringCount];
        for (int i = 0; i < stringCount; i++) {
            inputs[i] = scanner.next();
        }
        for (int i = 0; i < stringCount; i++) {
            StringBuilder evenString = new StringBuilder();
            StringBuilder oddString = new StringBuilder();
            for (int j = 0; j < inputs[i].length(); j++) {
                if (j % 2 == 0) {
                    evenString.append(inputs[i].charAt(j));
                } else {
                    oddString.append(inputs[i].charAt(j));
                }
            }

            System.out.print(evenString + " ");
            System.out.print(oddString);
            System.out.println();
        }

        scanner.close();
    }

    private static void hackerRankDay5() {
        //loops
        //multiplication table
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= 10; i++) {
            System.out.println((n + " x " + i) + " = " + i * n);
        }
        scanner.close();
    }
}
