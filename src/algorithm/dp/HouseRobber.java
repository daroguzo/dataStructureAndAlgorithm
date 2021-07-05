package algorithm.dp;

public class HouseRobber {
    public static void main(String[] args) {
        int[] num = {2, 7, 9, 3, 1, 8};

        System.out.println(new HouseRobber().solve(num));
    }

    private int solve(int[] num) {
        if (num.length == 0)
            return 0;

        int[] dp = new int[num.length + 1];
        dp[0] = 0;
        dp[1] = num[0];

        for (int i = 1; i < num.length; i++) {
            int val = num[i];
            dp[i + 1] = Math.max(dp[i], dp[i-1] + val);
            // dp[3] = max(dp[2], dp[1] + 9);
        }
//        print(dp);

        return dp[num.length];
    }

    private void print(int[] dp) {
        for (int i :
                dp) {
            System.out.println(i);
        }
    }
}
