package luyentap1;

import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = scanner.nextInt();
            System.out.println("Test " + i + ":");
            int[][] result = new int[n][n];
            int row = 0;
            int column = 0;
            int m = 0;

            for (int j = n * n; j > 0; j--) {
                result[row][column] = j;
                if (j == (n - m) * (n - m) - 3 * (n - m - 1) - (n - m - 2)) {
                    m = m + 2;
                }
                if ((n - m) * (n - m) + 1 >= j && j > (n - m) * (n - m) - (n - m - 1)) {
                    column++;
                }
                if ((n - m) * (n - m) - (n - m - 1) >= j && j > (n - m) * (n - m) - 2*(n - m - 1)) {
                    row++;
                }
                if ((n - m) * (n - m) - 2*(n - m - 1) >= j && j > (n - m) * (n - m) - 3* (n - m - 1)) {
                    column--;
                }
                if ((n - m) * (n - m) - 3 * (n - m - 1) >= j && j > (n - m)*(n - m) - 3*(n - m - 1) - (n - m - 2)) {
                    row--;
                }

            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(result[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
