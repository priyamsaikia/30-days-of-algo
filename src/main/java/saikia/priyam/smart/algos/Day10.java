package saikia.priyam.smart.algos;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        System.out.println("Hello World on Day 10");
        hackerRankDay14();
    }

    private static void hackerRankDay14() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Day10().new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

    class Difference {
        private int[] elements;
        public int maximumDifference;

        public Difference(int a[]) {
            elements = a;
        }

        // Add your code here

        public void computeDifference() {
            int difference = 0;
            for (int i = 0; i < elements.length - 1; i++) {
                for (int j = i; j < elements.length; j++) {
                    if (i != j) {
//                        System.out.println(elements[i] + " and " + elements[j]);
                        if (elements[i] > elements[j]) {
                            difference = elements[i] - elements[j];
                        } else {
                            difference = elements[j] - elements[i];
                        }
                    }
                    if (maximumDifference < difference) {
                        maximumDifference = difference;
                    }
                }
            }
        }

    } // End of Difference class

    private static void hackerRankDay13() {
        //Abstract classes
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        HRDay13Book book = new Day10().new Day13MyBook(title, author, price);
        book.display();
    }

    // Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable

    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    // Write your constructor here

    /**
     * Method Name: display
     * <p>
     * Print the title, author, and price in the specified format.
     **/
    class Day13MyBook extends HRDay13Book {
        int price;

        Day13MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        @Override
        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }
    // Write your method here
    // End class

    abstract class HRDay13Book {
        String title;
        String author;

        HRDay13Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    private static void hackerRankDay12() {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        System.out.println("Taking " + numScores + " inputs");
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
            System.out.println("Taking input " + i + " " + testScores[i]);
        }
        scan.close();

        HRDay12Student s = new Day10().new HRDay12Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }

    class HRDay12Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        HRDay12Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }

    }

    class HRDay12Student extends HRDay12Person {
        private int[] testScores;

        /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the HRDay12Person's first name.
         *   @param lastName - A string denoting the HRDay12Person's last name.
         *   @param id - An integer denoting the HRDay12Person's ID number.
         *   @param scores - An array of integers denoting the HRDay12Person's test scores.
         */
        // Write your constructor here

        HRDay12Student(String firstName, String lastName, int id, int[] testScores) {
            super(firstName, lastName, id);
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = id;
            this.testScores = testScores;
        }

        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */

        // Write your method here

        public char calculate() {
            int sum = 0;
            for (int i = 0; i < testScores.length; i++) {
                sum += testScores[i];
            }
            sum = sum / (testScores.length);
            if (sum <= 100 && sum >= 90) {
                return 'O';
            } else if (sum >= 80 && sum < 90) {
                return 'E';
            } else if (sum >= 70 && sum < 80) {
                return 'A';
            } else if (sum >= 55 && sum < 70) {
                return 'P';
            } else if (sum >= 40 && sum < 55) {
                return 'D';
            } else {
                return 'T';
            }
        }
    }
}
