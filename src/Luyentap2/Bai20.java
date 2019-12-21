package Luyentap2;

import java.util.*;

public class Bai20 {
    static Stack<String> ST = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String test = scanner.nextLine();
            if (ngoacDung(test)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean ngoacDung(String test) {
        for (int i = 0; i < test.length(); i++) {
            String a = String.valueOf(test.charAt(i));

            if (ST.empty()) {
                ST.push(a);
            } else {
               if ("{[(".contains(a)) {
                   ST.push(a);
                   continue;
               }
               if ("}])".contains(a)) {
                    String b = ST.pop();
                    switch (b) {
                        case "(": {
                            b = ")";
                            break;
                        }
                        case "{": {
                            b = "}";
                            break;
                        }
                        case "[": {
                            b = "]";
                            break;
                        }
                    }
                    if (!b.equals(a)) {
                        return false;
                    }
               }
            }
        }
        if (!ST.empty()) {
            return false;
        }
        return true;
    }
}
