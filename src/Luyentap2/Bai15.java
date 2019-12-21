package Luyentap2;

import java.util.*;

public class Bai15 {

    public static void main(String[] args) {
        int[] fibonacy = new int[93];
        fibonacy[1] = 1;
        fibonacy[2] = 1;
        for (int i = 3; i < 93; i++) {
            fibonacy[i] = fibonacy[i-1] + fibonacy[i-2];
        }
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            while (true) {
                if (n == 1) {
                    System.out.println("A");
                    break;
                }
                if (n == 2) {
                    System.out.println("B");
                    break;
                }
                if (k > fibonacy[n - 2]) {
                    k = k - fibonacy[n - 2];
                    n = n - 1;
                } else {
                    n = n - 2;
                }
            }
        }
    }
}