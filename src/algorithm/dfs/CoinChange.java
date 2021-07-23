package algorithm.dfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CoinChange {
    static int n, change, answer = Integer.MAX_VALUE;
    static Integer[] coins;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        coins = new Integer[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        Arrays.sort(coins, Collections.reverseOrder());
        change = sc.nextInt();
        CoinChange m = new CoinChange();
        m.dfs(0,0);
        System.out.println(answer);
    }

    private void dfs(int l, int sum) {
        if (l >= answer)
            return;
        if (sum > change)
            return;
        if (sum == change) {
            answer = l;
        } else {
            for (int i = 0; i < n; i++) {
                dfs(l+1, sum+coins[i]);
            }
        }
    }
}
