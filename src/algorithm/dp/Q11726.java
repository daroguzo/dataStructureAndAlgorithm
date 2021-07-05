package algorithm.dp;

import java.util.Scanner;

public class Q11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] dp = new int[input + 1];
        dp[1] = 1;
        if(input >= 2)
            dp[2] = 2;
        for (int i = 3; i <= input; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        System.out.println(dp[input]);
    }
}
