package luyentap1;
import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int x = 1; x <= t ; x++){
            int n = scanner.nextInt();
            int[] test = new int[n];
            for (int i = 0; i < n; i++) {
                test[i] = scanner.nextInt();
            }
            System.out.println("Test " + x + ":");
            doanTangDaiNhat(test);
        }
    }

    public static void doanTangDaiNhat(int[] test) {
        int max = 0;
        int dem = 1;
        for (int i = 1; i < test.length; i++) {
            if (test[i] > test[i-1]) {
                dem++;
            } else {
                if (max < dem) {
                    max = dem;
                }
                dem = 1;
            }
        }
        if (max < dem) {
            max = dem;
        }
        System.out.println(max);
        int[] result = new int[max];
        result[0] = test[0];
        dem = 1;
        for (int i = 1; i < test.length; i++) {
            if (test[i] > test[i-1]) {
                dem++;
                result[dem-1] = test[i];
            } else {
                if (dem == max) {
                    print(result);
                }
                dem = 1;
                result = new int[max];
                result[0] = test[i];
            }
            if (i == test.length - 1) {
                if (dem == max) {
                    print(result);
                }
            }
        }
    }
    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
