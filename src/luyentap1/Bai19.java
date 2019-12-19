package luyentap1;

import java.util.*;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int i = 1;
            while (true) {
                String binary = Integer.toBinaryString(i);
                String doiso = doi(binary);

                if (Integer.parseInt(doiso)%n == 0) {
                    System.out.println(doiso);
                    break;
                }
                i++;
            }
        }
    }

    public static String doi(String binary) {
        String result = "";
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == 48) {
                result += "0";
            } else {
                result += "9";
            }
        }
        return result;
    }
}
