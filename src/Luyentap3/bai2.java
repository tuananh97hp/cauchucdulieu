package Luyentap3;

import java.util.*;

public class bai2 {
    public static void main(String[] args) {
        String s;
        String x;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        x = sc.nextLine();
        int mark[][] = new int[1500][1500];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < x.length(); j++) {
                if (s.charAt(i) == x.charAt(j)) {
                    mark[i + 1][j + 1] = mark[i][j] + 1;
                } else
                    mark[i + 1][j + 1] = Math.max(mark[i][j + 1], mark[i + 1][j]);
            }
        }
        System.out.println(mark[s.length()][x.length()]);
    }
}




