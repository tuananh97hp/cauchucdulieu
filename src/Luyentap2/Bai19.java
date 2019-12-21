package Luyentap2;

import java.util.*;

public class Bai19 {
    static Stack<String> ST = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String test = scanner.nextLine();
            hauTo(test);
            System.out.println();
        }
    }

    public static void hauTo(String test) {
        for (int i = 0; i < test.length(); i++) {
            String a = String.valueOf(test.charAt(i));
            if ("()+-*/".contains(a)) {
                if (ST.empty()) {
                    ST.push(a);
                } else {
                    String b = ST.pop();
                    if (a.equals("(") || b.equals("(")) {
                        ST.push(b);
                        ST.push(a);
                        continue;
                    }
                    if (a.equals(")")) {
                        System.out.print(b);
                        String c = ST.pop();
                        while (!c.equals("(")) {
                            System.out.print(c);
                            c = ST.pop();
                        }
                    }
                    if ("+-".contains(a)) {
                        System.out.print(b);
                        ST.push(a);
                    }
                    if ("*/".contains(a)) {
                        if ("*/".contains(b)) {
                            System.out.print(b);
                            ST.push(a);
                        } else {
                            ST.push(b);
                            ST.push(a);
                        }
                    }
                }

            } else {
                System.out.print(a);
            }
        }
        while (!ST.isEmpty()) {
            System.out.print(ST.pop());
        }
    }
}