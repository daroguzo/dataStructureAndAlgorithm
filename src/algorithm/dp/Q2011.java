package algorithm.dp;

import java.util.Scanner;

public class Q2011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();
        long[] dp = new long[len + 1];
        dp[0] = 1;
        dp[1] = 1;

        if(input.charAt(0) == '0')
            System.out.println(0);

        else if(input.charAt(len-1) == '0' && input.charAt(len-2) != '1' && input.charAt(len-2) != '2')
            System.out.print(0);

        else {
            for(int i = 2; i <= len; i++) {
                int tmp = Integer.parseInt(input.charAt(i-1) + "");
                if(tmp > 0)
                    dp[i] = dp[i-1] % 1000000;

                tmp += Integer.parseInt(input.charAt(i-2) + "") * 10;
                if(10 <= tmp && tmp <= 26)
                    dp[i] = (dp[i] + dp[i-2]) % 1000000;
            }
            System.out.print(dp[len]);
        }
    }
}
