package band;

import java.util.Scanner;

public class d1b13 {

    static int n, k;
    static int[] a;
    static boolean loop = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            a = new int[n];
            loop = true;
            while (loop) {
                if (check()) {
                    print();
                }
                gen();
            }
        }
    }

    public static void gen() {
        int i = n - 1;
        while(i >= 0 && a[i] == 1) {
            a[i] = 0;
            i--;
        }
        if (i >= 0) {
            a[i]=1;
        } else {
            loop = false;
        }
    }

    public static void print() {
        for (int value : a) {
            System.out.print(value);
        }
        System.out.println();
    }

    public static boolean check() {
        int count = 0;
        for (int value : a) {
            if (value == 1) count++;
        }

        return count == k;
    }
}
