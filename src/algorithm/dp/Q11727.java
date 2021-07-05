package algorithm.dp;

import java.util.Scanner;

public class Q11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] dp = new int[input+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= input; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 2];
            dp[i] %= 10007;
        }
        System.out.println(dp[input]);
    }
}