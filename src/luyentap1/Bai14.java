package luyentap1;

import java.util.*;

import static java.lang.Math.pow;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 1) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int max = 0;
            for (int i = 0; i < n - k; i++) {
                max += pow(2, (n - i - 1));
            }
            List<String> result;
            for (int i = 0; i <= max; i++) {
                String binary = Integer.toBinaryString(i);
                int length = binary.length();
                for (int j = 0; j < n - length; j++) {
                    binary = "0" + binary;
                }
                if (check(binary, k)) {
//                    result.add(binary);
                }
            }
        }
    }

    public static boolean check(String b, int k) {
        int dem = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 48) {
                dem++;
            }
        }
        if (dem != k) {
            return false;
        }
        return true;
    }
}
