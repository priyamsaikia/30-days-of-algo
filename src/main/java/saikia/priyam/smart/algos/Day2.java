package saikia.priyam.smart.algos;

public class Day2 {
    public static void main(String[] args) {
        System.out.print("Hello World");
        System.out.println();
//        printTriangle(4);
        int n = 6;
        printTriangleMethodOne(n);
        System.out.println();
        printTriangleMethodTwo(n, "p");
    }

    /*
//TODO *
      ***
     *****
    *******
     */
    static void printTriangleMethodOne(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
  //TODO *
        ***
       *****
      *******
       */
    static void printTriangleMethodTwo(int n, String toPrint) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(toPrint + " ");
            }
            System.out.println();
        }
    }
}
