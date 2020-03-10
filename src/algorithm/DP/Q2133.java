package algorithm.DP;

import java.util.Scanner;

public class Q2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] dp = new int[input + 1];

        dp[0] = 1;
        if(input > 1)
            dp[2] = 3;

        for (int i = 4; i <= input; i += 2) {
            dp[i] = 3 * dp[i - 2];
            for (int j = 0; j < i - 2; j += 2) {
                dp[i] += dp[j] * 2;
            }
        }
        System.out.println(dp[input]);
    }
}
