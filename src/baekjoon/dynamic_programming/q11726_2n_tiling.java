package baekjoon.dynamic_programming;

import java.util.Scanner;

public class q11726_2n_tiling {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[1001];
        d[0] = 1;
        d[1] = 1;
        for (int i = 2; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
            d[i] %= 10007;
        }
        System.out.println(d[n]);
    }
}