package Luyentap2;

import java.util.*;

public class Bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] test = new int[n];
            for (int i = 0; i < n; i++) {
                test[i] = scanner.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int left = i;
                int right = i;

                while (left > 0) {
                    left--;
                    if (test[left] < test[i]) {
                        left++;
                        break;
                    }
                }
                while (right < n - 1) {
                    right++;
                    if (test[right] < test[i]) {
                        right--;
                        break;
                    }
                }
                if (sum < (right-left+1)*test[i]) {
                    sum = (right-left+1)*test[i];
                }
            }
            System.out.println(sum);
        }
    }
}
