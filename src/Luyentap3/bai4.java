package Luyentap3;

import java.util.*;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[] arrayTest = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arrayTest[i] = scanner.nextInt();
        }
        int[][] ff = new int[n + 1][s+1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j <= s; j++) {
                if (j == 0) {
                    ff[i][j] = 1;
                    continue;
                }
                if (j == 242) {
                    boolean ok = true;
                }
                if (i == 0) {
                    ff[i][j] = 0;
                    continue;
                }
                if (j < arrayTest[i]) {
                    ff[i][j] = ff[i-1][j];
                    continue;
                }
                if (ff[i-1][j] == 1) {
                    ff[i][j] = ff[i-1][j];
                    continue;
                }
                if (ff[i-1][j - arrayTest[i]] != 1) {
                    ff[i][j] = 0;
                } else {
                    ff[i][j] = 1;
                }
            }
        }
        if (ff[n][s] == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
