package Luyentap3;

import java.util.*;

public class bai5 {
    static int m = (int) (1e9 + 7);
    static long[] giaiThua;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            giaiThua = new long[n + 1];
            giaiThua[1] = 1;
            for (int i = 2; i < n + 1; i++) {
                giaiThua[i] = giaiThua[i - 1] * i % m;
            }
            System.out.println(toHop(n, k));
        }
    }

    public static long toHop(int n, int k) {
        return (giaiThua[n] / (giaiThua[k] * giaiThua[n - k]))%m;
    }
}
