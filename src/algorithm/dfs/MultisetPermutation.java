package algorithm.dfs;

import java.util.Scanner;

public class MultisetPermutation {
    private static int n, m;
    private static int[] pm;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];

        MultisetPermutation m = new MultisetPermutation();
        m.dfs(0);
    }

    public void dfs(int l) {
        if (l == m) {
            for (int i :
                    pm)
                System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[l] = i;
                dfs(l+1);
            }
        }
    }
}
