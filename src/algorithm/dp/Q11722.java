package algorithm.dp;

import java.util.Scanner;

public class Q11722 {
    static int input;
    static int[] dp;
    static int[] cost;

    public static void main(String[] args)   {
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            dp = new int[input+1];
            cost = new int[input+1];

            for(int i=1;i<=input;i++) {
                cost[i] = sc.nextInt();
            }
            dp[input] =1;
            for(int i=input-1;i>0;i--) {
                dp[i] =1;
                for(int j=input;j>0;j--) {
                    if(cost[i]>cost[j]) {
                        dp[i] = Math.max(dp[i], dp[j]+1);
                    }
                }
            }

            int max = Integer.MIN_VALUE;
            for(int i=1;i<=input;i++) {
                if(dp[i]>max) {
                    max = dp[i];
                }
            }
            System.out.println(max);
        }
}
