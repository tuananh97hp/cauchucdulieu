package Luyentap2;

import java.util.*;

import static java.lang.Math.*;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] test = new int[n];
            for (int i = 0; i < n; i++) {
                test[i] = scanner.nextInt();
            }
            Arrays.sort(test);
            int min = 0, dem = 1;
            for (int i = 1; i < n; i++) {
                if (min == 0 ||  (test[i]-test[i-1]) < min) {
                    dem = 1;
                    min = test[i]-test[i-1];
                } else if (min == (test[i]-test[i-1])) {
                    dem++;
                }
            }

            System.out.println(min + " " + dem);
        }
    }
}
