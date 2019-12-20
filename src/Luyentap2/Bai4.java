package Luyentap2;

import java.util.*;

public class Bai4 {
    static int buoc;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        sapXepNoiBot(ints);
    }
    public static void sapXepNoiBot(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean ok  = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                    ok = true;
                }
            }
            if (ok) {
                print(array);
            }
        }
    }

    public static void print(int[] result) {
        buoc++;
        System.out.print("Buoc " + buoc + ": ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
