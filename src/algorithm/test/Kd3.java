package algorithm.test;

import java.util.ArrayList;

public class Kd3 {
    public static boolean[] check;
    static ArrayList<ArrayList<Integer>> graph;
    static int left = 0;
    static int right = 0;
    static int answer = 0;
    public static void main(String[] args) {
        int n = 4;
        int[][] wires = {
                {1, 2},
                {2, 3},
                {3, 4}
        };
        System.out.println(new Kd3().solution(n, wires));
    }

    private int solution(int n, int[][] wires) {
        check = new boolean[n + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n-1; i++) {
            int x = wires[i][0];
            int y = wires[i][1];
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        dfs(1);
        answer = Math.abs(left - right);
        return answer;
    }

    private int solution2(int n, int[][] wires) {
        int[][] graph = new int[n + 1][n + 1];
        for (int i = 0; i < n-1; i++) {
            int x = wires[i][0];
            int y = wires[i][1];
            graph[x][y] = graph[y][x] = 1;
        }

        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void dfs(int v) {
        check[v] = true;
        for (int i : graph.get(v)) {
            if (!check[i])
                dfs(i);
        }
    }
}