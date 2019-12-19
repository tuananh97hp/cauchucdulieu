package luyentap1;

import java.util.*;

import static java.lang.Math.abs;

public class Bai18 {
    static int n, count = 0;
    static int[] result;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        result = new int[n + 1];
        datHau(1);
        System.out.println(count);
    }

    public static void datHau(int i) {
        for (int j = 1; j <= n; j++) {
            if (check(i, j)) {
                result[i] = j;
                if (i == n) {
                    count++;
                }
                datHau(i+1);
            }
        }
    }

    public static boolean check(int i, int j) {
        for (int k = 1; k < i; k++) {
            if (result[k] == j || abs(k - i) == abs(result[k] - j)) {
                return false;
            }
        }
        return true;
    }
}
