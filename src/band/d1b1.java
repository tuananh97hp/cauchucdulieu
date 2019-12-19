package band;

import java.util.Scanner;

public class d1b1 {
    public static void main(String[] args) {
        long[] f = new long[93];
        f[1] = f[2] = 1;

        for (int i = 3; i < 93; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            System.out.println(f[n]);
        }
    }
}
