package band;

import java.util.Scanner;

public class d1b3 {
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            longestIncrease(a);
        }
    }

    public static void longestIncrease(int[] a) {
        int max = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        System.out.println(max);
    }

    public static void print(int[] a) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}
