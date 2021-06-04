package algorithm.array;

import java.util.Scanner;

public class Peaks {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] table = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = sc.nextInt();
            }
        }
        System.out.println(new Peaks().solution2(n, table));
    }

    private int solution(int n, int[][] table) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (table[i][j] > table[i-1][j] && table[i][j] > table[i][j-1] && table[i][j] > table[i+1][j] && table[i][j] > table[i][j+1])
                    answer++;
            }
        }
        return answer;
    }

    private int solution2(int n,  int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    answer++;
            }
        }
        return answer;
    }
}
