package luyentap1;
import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String test = scanner.nextLine();
            if (test.equals(new StringBuffer(test).reverse().toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
