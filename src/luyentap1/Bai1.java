package luyentap1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[93];
        ints[0] = 1;
        ints[1] = 1;

        for (int i = 2; i < 92; i++) {
            ints[i] = ints[i-1] + ints[i-2];
        }

        int n = scanner.nextInt();
        while (n-- > 0) {
            int a = scanner.nextInt();
            System.out.println(ints[a-1]);
        }
    }
}
