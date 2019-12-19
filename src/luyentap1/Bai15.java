package luyentap1;

import java.util.*;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] test = new int[k];
            for (int i = 0; i < k; i++) {
                test[i] = scanner.nextInt();
            }
            System.out.println(sinhToHop(test, k, n));
        }
    }
    public static int sinhToHop(int[] array, int k, int n) {
        int count = 0;
        int[] arrayResult = new int[k];
        System.arraycopy(array,0, arrayResult,0, array.length);
        boolean check = true;
        for (int i = k - 1; i >= 0 ; i--) {
            if (array[i] < (n-(k-i-1))) {
                arrayResult[i] = arrayResult[i] + 1;
                for (int j = i+1; j < k; j++) {
                    arrayResult[j] = arrayResult[j - 1] + 1;
                }
                check = false;
                break;
            }
        }
        if (check) {
            return k;
        }
        for (int i = 0; i < k; i++) {
            check = true;
            for (int j = 0; j < k; j++) {
                if (arrayResult[i] == array[j]) {
                    check = false;
                    break;
                }
            }
            if (check) count++;
        }
        return count;
    }
}