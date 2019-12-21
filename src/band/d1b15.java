package band;

import java.util.Scanner;

public class d1b15 {

    static int n, k;
    static int[] a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            a = new int[k];

            for (int i = 0; i < k; i++) {
                a[i] = 1;
            }
            print();

            int j = k - 1;
            while (a[0] < n) {
                if (a[j] == n) {
                    j--;
                }
                a[j]++;
                print();
            }
        }
    }

    public static void print() {
        for (int value : a) {
            System.out.print(value);
        }
        System.out.println();
    }
}
