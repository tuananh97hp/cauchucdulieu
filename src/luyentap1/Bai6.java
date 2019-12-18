package luyentap1;
import java.util.*;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int x = 1; x <= t; x++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] test = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    test[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Test "+ x + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int a = 0;
                    for (int k = 0; k < m; k++) {
                        a += test[i][k]*test[j][k];
                    }
                    System.out.print(a + " ");
                }
                System.out.println();
            }
        }
    }
}
