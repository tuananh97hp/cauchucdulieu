package Luyentap2;

import java.util.*;

public class Bai29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            Queue<Integer> queue = new LinkedList<>();
            int s = scanner.nextInt();
            int k = scanner.nextInt();
            int[] dist = new int[100001];
            for (int i = 0; i < dist.length; i++) {
                dist[i] = -1;
            }
            queue.add(s);
            dist[s] = 0;
            if (s == k) {
                queue.poll();
                System.out.println(0);
            }
            while (!queue.isEmpty()) {
                int q = queue.poll();
                int tta = q - 1;
                if (tta == k) {
                    System.out.println(dist[q] + 1);
                    break;
                } else if (tta > 0 && dist[tta] == -1) {
                    dist[tta] = dist[q] + 1;
                    queue.add(tta);
                }
                int ttb = q * 2;
                if (ttb == k) {
                    System.out.println(dist[q] + 1);
                    break;
                } else if (dist[ttb] == -1 && q <= k) {
                    dist[ttb] = dist[q] + 1;
                    queue.add(ttb);
                }
            }
        }
    }
}