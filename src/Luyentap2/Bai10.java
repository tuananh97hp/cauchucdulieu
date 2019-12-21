package Luyentap2;

import java.util.*;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] test = new int[n];
        for (int i = 0; i < n; i++) {
            test[i] = scanner.nextInt();
        }
        Arrays.sort(test);
        int q = scanner.nextInt();
        while (q-- > 0) {
            int a = scanner.nextInt();
            timKiemNhiPhan(test, a);
        }
    }
    public static void timKiemNhiPhan(int[] test, int k) {
        int min = 0;
        int max = test.length - 1;
        int key = 0;
        boolean ok = true;
        while (ok && min <= max) {
            key = (min + max) / 2;
            if (test[key] > k) {
                max = key - 1;
            }
            if (test[key] < k) {
                min = key + 1;
            }
            if (test[key] == k) {
                if (test[key] == test[key + 1]) {
                    min = k + 1;
                } else {
                    ok = false;
                }
            }
        }
        if (test[key] > k) {
            System.out.println(key);
        } else {
            System.out.println(key + 1);
        }
    }
}
