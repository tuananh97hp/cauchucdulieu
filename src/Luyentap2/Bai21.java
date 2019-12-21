package Luyentap2;

import java.util.*;

public class Bai21 {
    static int max = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arraytest = new int[n];
            for (int i = 0; i < n; i++) {
                arraytest[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                boolean ok = false;
                for (int j = i+1; j < n; j++) {
                    if (arraytest[j] > arraytest[i]) {
                        System.out.print(arraytest[j] + " ");
                        ok = true;
                        break;
                    }
                }
                if (!ok) {
                    System.out.print(-1 + " ");
                }
            }
            System.out.println();
        }
    }


}