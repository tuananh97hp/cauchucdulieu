package luyentap1;

import java.util.*;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        String[] test = new String[t];
        for (int i = 0; i < t; i++) {
            test[i] = scanner.nextLine();
        }
        email(test);
    }

    public static void email(String[] s) {
        String[] result = new String[s.length];

        for (int i = 0; i < s.length; i++) {
            String[] split = s[i].toLowerCase().trim().split(" ");
            result[i] = split[split.length - 1];
            for (int j = 0; j < split.length - 1; j++) {
                if (!split[j].equals("")) {
                    result[i] += String.valueOf(split[j].charAt(0));
                }
            }
            boolean ok = true;
            int dem = 1;
            for (int j = 0; j < i; j++) {
                if (result[i].equals(result[j]) || (result[i] + dem).equals(result[j])) {
                    dem++;
                }
            }
            if (dem!=1) {
                result[i] += dem;
            }
            System.out.println(result[i] + "@ptit.edu.vn");
        }
    }
}
