package luyentap1;
import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int x = 1; x <= t ; x++){
            int n = scanner.nextInt();

            int[] test = new int[n];

            for (int i = 0; i < n; i++) {
                test[i] = scanner.nextInt();
            }
            System.out.println("Test " + x + ":");
            xuatHien(test);
        }
    }
    public static void xuatHien(int[] test) {
        boolean[] check = new boolean[test.length];
        for (int i = 0; i < test.length; i++) {
            int xuatHien = 1;
            if (check[i] == false) {
                for (int j = i+1; j < test.length; j++) {
                    if (test[i] == test[j]) {
                        check[j] = true;
                        xuatHien++;
                    }
                }
                System.out.println(test[i] + " xuat hien " + xuatHien + " lan");
            }
        }
    }
}
