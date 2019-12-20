package Luyentap2;

import java.util.*;

public class Bai3 {
    static int[] result;
    static int buoc;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        result = new int[n];
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        sapXepChen(ints);
    }
    public static void sapXepChen(int[] array) {
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
            for (int j = i - 1; j >= 0 ; j--) {
                if (result[j] > array[i]) {
                    result[j + 1] = result[j];
                    result[j] = array[i];
                }
            }
            print(i);
        }
    }

    public static void print(int b) {
        buoc++;
        System.out.print("Buoc " + buoc + ": ");
        for (int i = 0; i <= b; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
