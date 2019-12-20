package Luyentap2;

import java.util.*;

public class Bai2 {
    static int buoc;
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int[] test = new int[n];
        for (int i = 0; i < n; i++) {
            test[i] = scanner.nextInt();
        }
        sapXepChon(test);
    }
    public static void sapXepChon(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int vitriMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    vitriMin = j;
                }
            }
            if (vitriMin != i) {
                int c = array[i];
                array[i] = array[vitriMin];
                array[vitriMin] = c;
                print(array);
            }
        }
    }

    public static void print(int[] array) {
        buoc++;
        System.out.print("Buoc " + buoc + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
