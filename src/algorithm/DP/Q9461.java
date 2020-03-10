package algorithm.DP;

import java.util.Scanner;

public class Q9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(), input;
        long[] dp = new long[100 + 1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        for (int i = 6; i <= 100; i++) {
            dp[i] = dp[i-1] + dp[i-5];
        }
        for (int i = 0; i < count; i++) {
            input = sc.nextInt();
            System.out.println(dp[input]);
        }
    }
}
