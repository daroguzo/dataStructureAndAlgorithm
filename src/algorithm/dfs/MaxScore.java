package algorithm.dfs;

import java.util.Scanner;

public class MaxScore {
    static int n, time, score = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        time = sc.nextInt();
        int[][] problems = new int[n][2];
        for (int i = 0; i < n; i++) {
            problems[i][0] = sc.nextInt();
            problems[i][1] = sc.nextInt();
        }
        MaxScore m = new MaxScore();
        m.dfs(0, 0, 0, problems);
        System.out.println(score);
    }

    private void dfs(int l, int sum, int t,  int[][] problems) {
        if (t > time)
            return;
        if(l == n) {
            score = Math.max(score, sum);
        } else {
            dfs(l+1, sum + problems[l][0], t + problems[l][1], problems);
            dfs(l+1, sum, t, problems);
        }
    }
}
