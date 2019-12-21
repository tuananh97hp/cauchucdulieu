package Luyentap2;

import java.util.*;

public class Bai12 {
    static long m = (long) (1e9 + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- >0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long luyThua = luyThua(n, k);
            System.out.println(luyThua);
        }
    }

    public static long luyThua(int n, int k) {
        if (k == 0) return 1;
        long chia = luyThua(n,k/2);
        if (k%2 != 0) return (chia*n%m)*chia%m;
        return (chia*chia)%m;
    }
}
