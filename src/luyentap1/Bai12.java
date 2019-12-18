package luyentap1;

import java.util.*;

public class Bai12 {
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
        for (int i = 0; i < s.length; i++) {
            String[] split = s[i].toLowerCase().split(" ");
            String result = "";
            for (int j = 0; j < split.length; j++) {
                result += split[j].substring(0,1).toUpperCase() + split[j].substring(1) + " ";
            }
            System.out.println(result);
        }
    }
}
