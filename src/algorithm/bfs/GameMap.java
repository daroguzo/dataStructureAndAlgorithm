package algorithm.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {
    public int solution(int[][] maps) {
        int n = maps.length, m = maps[0].length;
        int[] dx = {-1, 0, 0, 1}, dy = {0, 1, -1, 0};
        boolean[][] visit = new boolean[n][m];
        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(0, 0, 1));
        visit[0][0] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.x == n - 1 && node.y == m - 1) {
                return node.cost;
            }
            for (int i = 0; i < 4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(maps[nx][ny] == 1 && !visit[nx][ny]) {
                        visit[nx][ny] = true;
                        queue.offer(new Node(nx, ny, node.cost + 1));
                    }
                }
            }
        }

        return -1;
    }

    public static class Node {
        int x;
        int y;
        int cost;

        public Node (int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
}
