package saikia.priyam.smart.algos;

public class Day1 {
    static void printStarLeftCorner(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printStarRightCorner(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (n - j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] arg) {
        System.out.println("Priyam");
        printStarRightCorner(5);
        printStarLeftCorner(5);
    }
}
