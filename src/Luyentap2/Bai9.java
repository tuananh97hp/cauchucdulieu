package Luyentap2;

import java.util.*;

public class Bai9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] test = new int[n];
            for (int i = 0; i < n; i++) {
                test[i] = scanner.nextInt();
            }
            timKiemNhiPhan(test, k);
        }
    }

    public static void timKiemNhiPhan(int[] test, int k) {
        int min = 0;
        int max = test.length - 1;
        boolean ok = true;
        while (ok && min <= max) {
            int key = (min + max) / 2;
            if (test[key] > k) {
                max = key - 1;
            }
            if (test[key] < k) {
                min = key + 1;
            }
            if (test[key] == k) {
                System.out.println(key + 1);
                ok = false;
            }
        }
        if (ok) {
            System.out.println("NO");
        }
    }
}
