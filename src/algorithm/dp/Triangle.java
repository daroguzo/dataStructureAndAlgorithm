package algorithm.dp;

import java.util.Arrays;

public class Triangle {
    public int solution(int[][] triangle) {
        int length = triangle.length;
        int[][] dp = new int[length][length];

        dp[0][0] = triangle[0][0];
        for (int i = 1; i < length; i++) {
            dp[i][0] = dp[i - 1][0] + triangle[i][0];
            dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];

            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
            }
        }

        Arrays.sort(dp[length - 1]);
        return dp[length - 1][length - 1];
    }

    public int solution2(int[][] triangle) {
        int answer = 0;
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    triangle[i][j] = triangle[i][j] + triangle[i - 1][j];
                } else if (i == j) {
                    triangle[i][j] = triangle[i][j] + triangle[i - 1][j - 1];
                } else {
                    int left = triangle[i][j] + triangle[i - 1][j - 1];
                    int right = triangle[i][j] + triangle[i - 1][j];
                }

                answer = Math.max(answer, triangle[i][j]);
            }
        }
        return answer;
    }

    public int solution3(int[][] triangle) {
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                int left = triangle[i][j] + triangle[i - 1][j];
                int right = triangle[i][j] + triangle[i + 1][j + 1];
                triangle[i][j] = Math.max(left, right);
            }
        }
        return triangle[0][0];
    }
}
