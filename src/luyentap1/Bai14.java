package luyentap1;

import java.util.*;

import static java.lang.Math.pow;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < n - k; i++) {
            max += pow(2, (n - i - 1));
        }
        List<String> results = new LinkedList<>();
        for (int i = 0; i <= max; i++) {
            String binary = Integer.toBinaryString(i);
            int length = binary.length();
            for (int j = 0; j < n - length; j++) {
                binary = "0" + binary;
            }
            if (check(binary, k)) {
                results.add(binary);
            }
        }
        System.out.println(results.size());
        for (String result : results) {
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == 48){
                    System.out.print("A");
                } else {
                    System.out.print("B");
                }
            }
            System.out.println();
        }
    }

    public static boolean check(String b, int k) {
        int dem = 1;
        int max = 0;
        for (int i = 1; i < b.length(); i++) {
            if (b.charAt(i) == 48 && b.charAt(i) == b.charAt(i - 1)) {
                dem++;
            } else {
                if (dem == k) {
                    max++;
                }
                dem = 1;
            }
        }
        if (dem == k) {
            max++;
        }
        if (max != 1) {
            return false;
        }
        return true;
    }
}
