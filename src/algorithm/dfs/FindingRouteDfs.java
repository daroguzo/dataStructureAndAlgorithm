package algorithm.dfs;

import java.util.Scanner;

public class FindingRouteDfs {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;
    public void dfs(int v) {
        if (v == n)
            answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    dfs(i);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        FindingRouteDfs findingRouteDfs = new FindingRouteDfs();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
        }
        ch[1] = 1;
        findingRouteDfs.dfs(1);
        System.out.println(answer);
    }
}
