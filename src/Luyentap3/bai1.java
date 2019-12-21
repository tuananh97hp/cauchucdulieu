package Luyentap3;

import java.util.*;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int[] w = new int[n + 1];
        for(int i = 1; i < n + 1; i++) {
            w[i] = sc.nextInt();
        }
        int dp[][] = new int[n + 1][a + 1];
        int max =0;
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j <= a; j++){
                if (j == 0) {
                    dp[i][j] = 1;
                    continue;
                }
                if (i == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                if (j < w[i]) {
                    dp[i][j] = dp[i-1][j];
                    continue;
                }
                if (dp[i-1][j] == 1) {
                    dp[i][j] = dp[i-1][j];
                    continue;
                }
                if (dp[i-1][j - w[i]] != 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = 1;
                }
                if (dp[i][j] == 1) {
                    max = Math.max(max, j);
                }
            }
        }
        System.out.println(max);
    }
}
