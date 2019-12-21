package Luyentap3;

import java.util.*;

public class bai3 {
    public static void main(String[] args) {
        int n;
        int a[];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int f[] = new int[n];
        int result = 1;
        for (int i = 0; i < n; i++) {
            f[i] = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] > a[j])
                    f[i] = Math.max(f[i], f[j] + 1);
            }
            result = Math.max(result, f[i] + 1);
        }
        System.out.println(result);
    }
}