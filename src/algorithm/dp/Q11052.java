package algorithm.dp;

import java.util.Scanner;

public class Q11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt();
        int[] pack = new int[card + 1];
        int[] dp = new int[card + 1];
        for (int i = 1; i <= card; i++)
            pack[i] = sc.nextInt();

        for (int i = 1; i <= card; i++)
            for (int j = 1; j <= i; j++)
                dp[i] = Math.max(dp[i], dp[i-j] + pack[j]);

        System.out.println(dp[card]);
    }
}
