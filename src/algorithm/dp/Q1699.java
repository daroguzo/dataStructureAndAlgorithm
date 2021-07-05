package algorithm.dp;

import java.util.Scanner;

public class Q1699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] dp = new int[input + 1];

        for (int i = 1; i < dp.length; i++) {
            dp[i] = isSquare(i) ? 1 : Integer.MAX_VALUE;

            if(dp[i] > 1)
                for (int j = 1; j <= (i / 2); j++)
                    dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
        }

        System.out.println(dp[input]);
    }

    public static boolean isSquare(int num) {
        return Math.pow((int)Math.sqrt(num), 2) == num;
    }
}
