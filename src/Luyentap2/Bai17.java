package Luyentap2;

import java.util.*;

public class Bai17 {
    static int n;
    static long m = (long) (1e9 + 7);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            n = scanner.nextInt();
            int k = scanner.nextInt();
            long[][] test = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    test[i][j] = scanner.nextInt();
                }
            }
            long[][] result = luyThuaMatran(test, k);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static long[][] luyThuaMatran(long[][] test,int k) {
        if (k == 1) return test;
        long[][] dem = luyThuaMatran(test, k/2);
        if (k%2 != 0) return tichMatran(tichMatran(dem,test),dem);
        return tichMatran(dem, dem);
    }
    public static long[][] tichMatran(long[][] a, long[][] b) {
        long[][] c = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] = (c[i][j] + a[i][k]*b[k][j])%m;
                }
            }
        }
        return c;
    }
}
