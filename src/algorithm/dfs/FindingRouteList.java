package algorithm.dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingRouteList {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void dfs(int v) {
        if (v == n)
            answer++;
        else {
            for (int nextV :
                    graph.get(v)) {
                if (ch[nextV] == 0) {
                    ch[nextV] = 1;
                    dfs(nextV);
                    ch[nextV] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        FindingRouteList findingRouteDfs = new FindingRouteList();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph.get(x).add(y);
        }
        ch[1] = 1;
        findingRouteDfs.dfs(1);
        System.out.println(answer);
    }
}
