package algorithm.dfs;

public class Virus {
    public int[][] solution(int rows, int columns, int max_virus, int[][] queries) {
        int[][] answer = new int[rows][columns];
        int[] dx = {-1, 1, 0 ,0};
        int[] dy = {0, 0, -1, 1};

        for (int[] query : queries) {
            int x = query[0] - 1;
            int y = query[1] - 1;

            multiplication(answer, max_virus, rows, columns, x, y);
        }
        return answer;
    }
    void multiplication (int[][] answer, int max_virus, int rows, int columns, int x, int y) {
        int[] dx = {-1, 1, 0 ,0};
        int[] dy = {0, 0, -1, 1};

        if (answer[x][y] == max_virus) {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < rows && ny < columns) {
                    if (answer[nx][ny] == max_virus) {
                        multiplication(answer, max_virus, rows, columns, nx, ny);
                    } else {
                        answer[nx][ny]++;
                    }
                }
            }
        } else {
            answer[x][y]++;
        }
    }

    public static void main(String[] args) {
        Virus virus = new Virus();
        int[][] queries = {{3, 2}, {3, 2}, {2, 2}, {3, 2}, {1, 4}, {3, 2}, {2, 3}, {3, 1}};
        int[][] queries2 = {{3, 2}, {3, 2}, {2, 2}, {3, 2}, {1, 4}, {3, 2}};
        int[][] answer = virus.solution(3, 4, 2, queries2);

        for (int[] ints : answer) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }
}
