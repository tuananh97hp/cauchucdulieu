package Luyentap2;

import java.util.*;

public class Bai1 {
    static int buoc = 0;
    static int[] test;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        test = new int[n];
        for (int i = 0; i < n; i++) {
            test[i] = scanner.nextInt();
        }
        buocSout(test);
    }
    public static void buocSout(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean ok = false;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                    ok = true;
                }
            }
            if (ok) {
                buoc++;
                System.out.print("Buoc "+ buoc + ": ");
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
