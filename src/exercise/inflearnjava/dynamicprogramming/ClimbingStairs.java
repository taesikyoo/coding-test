package exercise.inflearnjava.dynamicprogramming;

public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}