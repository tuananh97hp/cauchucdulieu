package luyentap1;
import java.util.*;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String test = scanner.nextLine();
            if (soThuanNghich(test) && tongChia(test)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    public static boolean soThuanNghich(String s) {
        if (!s.equals(new StringBuffer(s).reverse().toString())) {
            return false;
        }
        return true;
    }

    public static boolean tongChia(String s) {
        long sum = 0;
        if (s.charAt(0) != 56) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - 48;
        }
        if (sum%10 != 0) {
            return false;
        }
        return true;
    }
}
