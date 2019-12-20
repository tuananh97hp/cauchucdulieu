package luyentap1;
import java.util.*;

public class UCBC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int number1 = a;
        int number2 = b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("UC: " + a);
        System.out.println("BC: " + number1*number2/a);
    }
}
