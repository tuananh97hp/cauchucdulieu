package Luyentap2;

import java.util.*;

public class Bai16 {
    static long m = (long) 1e9 + 7;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long f = fibonacy(n);
            System.out.println(f);
        }
    }
    public static long fibonacy(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long c = fibonacy(n - 1);
        long d = fibonacy(n - 2);
        return (c+d)%m;
    }
}
