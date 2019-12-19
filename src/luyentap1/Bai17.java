package luyentap1;

import java.util.*;

public class Bai17 {
    static int n, k;
    static ArrayList<int[]> re = new ArrayList<>();
    static int[] result = new int[10];
    static int[][] arrayTest;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        k = scanner.nextInt();
        arrayTest = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrayTest[i][j] = scanner.nextInt();
            }
        }
        sinhKeTiep(1);
        System.out.println(re.size());
        for (int i = 0; i < re.size(); i++) {
            int[] a = (int[]) re.toArray()[i];
            for (int j = 1; j <= n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }

    }

    public static void sinhKeTiep(int i) {
        for (int j = 1; j <= n; j++) {
            if (check(i, j)) {
                result[i] = j;
                if (i == n) add(result);
                sinhKeTiep(i + 1);
            }
        }
    }

    public static boolean check(int i, int j) {
        for (int l = 1; l < i; l++) {
            if (result[l] == j) {
                return false;
            }
        }
        return true;
    }

    public static void add (int[] array) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arrayTest[i][array[i+1] - 1];
        }
        if (sum == k) {
            re.add(Arrays.copyOf(array, array.length));
        }
    }
}