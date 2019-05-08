package saikia.priyam.smart.algos;

import java.util.Scanner;

public class Day7 {
    static String TAG = Day7.class.getSimpleName();
    private static Scanner scanner;

    public static void main(String args[]) {
        scanner = new Scanner(System.in);
        hackerRankDay4();
    }

    private static void hackerRankDay4() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
    }

    static class Person {
        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if (initialAge < 0) {
                age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            } else {
                age = initialAge;
            }
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if (age < 13) {
                System.out.println("You are young.");
            } else if (age < 18 && age >= 13) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }

        public void yearPasses() {
            // Increment this person's age.
            age++;
        }
    }

    private static void hackerRankDay3() {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {//N is even
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }

    static void hackerRankDay2Solve(double meal_cost, int tip_percent, int tax_percent) {
        double tipAmount = ((double) tip_percent / 100) * meal_cost;
        double taxAmount = ((double) tax_percent / 100) * meal_cost;
        double totalAmount = meal_cost + tipAmount + taxAmount;
        totalAmount = Math.round(totalAmount);
        System.out.println((int) totalAmount);
    }

    static void hackerRankDay2() {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        hackerRankDay2Solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

    private static void hackerRankDay1() {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        int ii;
        double dd;
        String ss;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        ii = scan.nextInt();
        dd = scan.nextDouble();
        ss = scan.next();
        ss += scan.nextLine();

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        System.out.println(ii + i);
        System.out.println(dd + d);
        System.out.println(s + ss);

        scan.close();
    }


    private static void hackerRankDay0() {
        String s = scanner.nextLine();
        System.out.println("Hello World!");
        System.out.println(s);
    }
}
