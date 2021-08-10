package algorithm.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class FindingMazeBFS {
    int[] dx = {0, 0, -1, 1};
    int[] dy = {1, -1, 0, 0};
    static int[][] maze = new int[8][8];
    static int[][] dis = new int[8][8];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        FindingMazeBFS m = new FindingMazeBFS();
        m.bfs(1, 1);
        if (dis[7][7] == 0)
            System.out.println(-1);
        else
            System.out.println(dis[7][7]);
    }

    private void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        maze[x][y] = 1;
        int level = 0;
        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
}
