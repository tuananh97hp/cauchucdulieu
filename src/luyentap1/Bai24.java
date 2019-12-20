package luyentap1;

import java.util.*;

public class Bai24 {
    static int[] array = {1,2,5,10,20,50,100,200,500,1000};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- >0) {
            int n = scanner.nextInt();

            int sum = 0;

            for (int i = array.length - 1; i >= 0; i--) {
                sum += n/array[i];
                n = n%array[i];
            }
            System.out.println(sum);
        }
    }
}

