package luyentap1;
import java.util.*;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String test = scanner.nextLine();
            if (soThuanNghich(test) && soChan(test)) {
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

    public static boolean soChan(String s) {
        if (s.contains("1") || s.contains("3") || s.contains("5") || s.contains("7") || s.contains("9")) {
            return false;
        }
        return true;
    }
}
