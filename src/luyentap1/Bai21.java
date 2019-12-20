package luyentap1;
import java.util.*;

public class Bai21 {
    static int n, min = 0;
    static int[][] test;
    static int[] result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        test = new int[n][n];
        result = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                test[i][j] = scanner.nextInt();
            }
        }
        sinh(0);
        System.out.println(min);
    }

    public static void sinh(int i) {
        for (int j = 0; j < n; j++) {
            if (check(i, j)) {
                result[i] = j;
                if (i == n - 1) {
                    if (min == 0 || min > sum()) {
                        min = sum();
                    }
                }
                sinh(i + 1);
            }
        }
    }

    public static int sum() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += test[i][result[i]];
        }
        return sum;
    }

    public static boolean check(int x, int y) {
        for (int i = 0; i < x; i++) {
            if (x == y || result[i] == y || (result[i] == x && i == y)) {
                return false;
            }
        }
        return true;
    }

}
