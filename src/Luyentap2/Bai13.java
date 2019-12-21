package Luyentap2;

import java.util.*;

import static java.lang.Math.*;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(gapDoiDaySo(n, k));
        }
    }
    public static int gapDoiDaySo(int n, int k) {
        int mid = (int) (pow(2,n)/2);
        if (k == mid) {
            return n;
        }
        if (k > mid) {
            return gapDoiDaySo(n-1, k - mid);
        }
        return gapDoiDaySo(n-1, k);
    }
}
