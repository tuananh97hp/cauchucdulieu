package luyentap1;
import java.util.*;
public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int stt = scanner.nextInt();
            String test = scanner.next();
            System.out.print(stt + " ");
            System.out.println(sinhHoanVi(test));
        }
    }

    public static String sinhHoanVi(String test) {
        String result = "";
        char[] chars = test.toCharArray();
        int i = chars.length - 1;
        if (i==0) {
            return "BIGGEST";
        }
        while (i-- >= 0) {
            if (chars[i] < chars[i+1]) {
                break;
            }
            if (i==0) {
                return "BIGGEST";
            }
        }
        for (int j = chars.length - 1; j > i; j--) {
            if (chars[j] > chars[i]){
                char c = chars[j];
                chars[j] = chars[i];
                chars[i] = c;
                break;
            }
        }
        for (int j = 1; j <= (chars.length - i)/2; j++) {
            char c;
            c = chars[i + j];
            chars[i + j] = chars[chars.length - j];
            chars[chars.length - j] = c;
        }
        for (int j = 0; j < chars.length; j++) {
            result += chars[j];
        }
        return  result;
    }
}
