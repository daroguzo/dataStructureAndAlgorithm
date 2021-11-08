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

    static class Position {
        int x, y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isValid(int width, int height) {
            if (x < 0 || x >= width) return false;
            if (y < 0  || y >= height) return false;
            return true;
        }
    }

    public int solution2(int[][] maps) {
        Queue<Position> queue = new LinkedList<>();
        int mapHeight = maps.length;
        int mapWidth = maps[0].length;
        int[][] count = new int[mapHeight][mapWidth];
        boolean[][] visited = new boolean[mapHeight][mapWidth];

        queue.offer(new Position(0, 0));
        count[0][0] = 1;
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Position current = queue.poll();

            int currentCount = count[current.y][current.x];

            // 4가지 경우
            final int[][] moving = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
            for (int i = 0; i < moving.length; i++) {
                Position moved = new Position(current.x + moving[i][0], current.y + moving[i][1]);
                if (!moved.isValid(mapWidth, mapHeight)) continue;
                if (visited[moved.y][moved.x]) continue;
                if (maps[moved.y][moved.x] == 0) continue;

                count[moved.y][moved.x] = currentCount + 1;
                visited[moved.y][moved.x] = true;
                queue.offer(moved);
            }
        }
        int answer = count[mapHeight - 1][mapWidth - 1];
        if (answer == 0) return -1;

        return answer;
    }
}
