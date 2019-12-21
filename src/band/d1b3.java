package band;

import java.util.Scanner;

public class d1b3 {
    static int n;
    static int[] a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int index = 1;
        while (t-- > 0) {
            n = in.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            System.out.println("Test " + (index++) +":");
            longestIncrease(a);
        }
    }

    public static void longestIncrease(int[] a) {
        int max = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(max);
        count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                count++;
                if (count == max) {
                    print(i - max + 1, i);
                }
            } else {
                count = 1;
            }
        }
    }

    public static void print(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
