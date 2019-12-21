package Luyentap2;

import java.util.*;

public class Bai14 {
    static long m = 123456789;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long test = scanner.nextLong();
            System.out.println(ketqua(test - 1));
        }
    }

    private static long ketqua(long k) {
        if (k == 0) return 1;
        long t = ketqua(k / 2);
        if (k % 2 != 0)
            return (t * 2 % m) * t % m;
        return (t * t) % m;
    }
}