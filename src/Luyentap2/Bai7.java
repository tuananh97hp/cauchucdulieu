package Luyentap2;

import java.lang.reflect.Array;
import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] test = new int[n];
            for (int i = 0; i < n; i++) {
                test[i] = scanner.nextInt();
            }
            int[] testSort = Arrays.copyOf(test, test.length);
            Arrays.sort(testSort);
            int result = 0;
            int dem = 0;
            for (int i = 0; i < n; i++) {
                if (test[i] != testSort[i]) {
                    if (result == 0) {
                        dem = 0;
                    }
                    dem++;
                    result += dem;
                    dem = 0;
                } else {
                    dem++;
                }
            }

            if (result > 0) {
                System.out.println(result);
            } else {
                System.out.println("YES");
            }
        }
    }
}
