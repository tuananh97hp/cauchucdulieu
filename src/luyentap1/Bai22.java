package luyentap1;

import java.util.*;

import static java.lang.Math.sqrt;

public class Bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- >0) {
            int n = scanner.nextInt();
            long c = 0;
            for (int i = 1; i <= sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) {
                        c++;
                    }
                    if ((n / i) % 2 == 0) {
                        c++;
                    }
                }
                if (i * i == n && i % 2 == 0) {
                    c--;
                }
            }
            System.out.println(c);
        }
    }
}
