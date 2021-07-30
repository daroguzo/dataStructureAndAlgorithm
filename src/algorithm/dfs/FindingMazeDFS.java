package algorithm.dfs;

import java.util.Scanner;

public class FindingMazeDFS {
    static int answer = 0;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    static int[][] maze;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maze = new int[8][8];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        FindingMazeDFS m = new FindingMazeDFS();
        maze[1][1] = 1;
        m.dfs(1, 1);
        System.out.println(answer);
    }

    private void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    dfs(nx, ny);
                    maze[nx][ny] = 0;
                }
            }
        }
    }
}
