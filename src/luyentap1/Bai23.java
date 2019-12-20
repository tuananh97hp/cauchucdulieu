package luyentap1;
import java.util.*;

public class Bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long minRow = 0;
        long minColumn = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < minRow || minRow == 0) {
                minRow = a;
            }

            if (b < minColumn || minColumn == 0) {
                minColumn = b;
            }
        }
        System.out.println(minColumn*minRow);
    }
}
