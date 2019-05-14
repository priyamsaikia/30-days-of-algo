package saikia.priyam.smart.algos;

import java.util.Scanner;

public class Day9 {
    private static final String TAG = Day9.class.getSimpleName();

    public static void main(String args[]) {
        System.out.println("Hello World on " + TAG);
        hackerRankDay11(6);
    }

    private static void hackerRankDay11(int n) {
        //2D arrays
        /*
        Calculate the hourglass sum for every hourglass in A,
         then print the maximum hourglass sum.

         note: We define an hourglass in A
         to be a subset of values with indices falling in this pattern in
         A's graphical representation:
         a b c
           d
         e f g
         */

        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        Integer maxHourGlassSum = null;
        int hourGlassSum;

        for (int j = 0; j < n - 2; j++) {
            for (int l = 0; l < n - 2; l++) {
                hourGlassSum = arr[j][l] + arr[j][l + 1] + arr[j][l + 2]
                        + arr[j + 1][l + 1]
                        + arr[j + 2][l] + arr[j + 2][l + 1] + arr[j + 2][l + 2];
//                System.out.print(arr[j][l] + " ");
//                System.out.print(arr[j][l + 1] + " ");
//                System.out.print(arr[j][l + 2] + " ");
//
//                System.out.print(arr[j + 1][l + 1] + " ");
//
//                System.out.print(arr[j + 2][l] + " ");
//                System.out.print(arr[j + 2][l + 1] + " ");
//                System.out.print(arr[j + 2][l + 2] + " ");
//                System.out.println();
                if (maxHourGlassSum == null || maxHourGlassSum < hourGlassSum) {
                    maxHourGlassSum = hourGlassSum;
                }
            }

        }
        System.out.println(maxHourGlassSum);

        scanner.close();
    }
}
