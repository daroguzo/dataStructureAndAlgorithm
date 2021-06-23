package algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class CraneGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(new CraneGame().solution(n, board, m, moves));
    }

    private int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[j][moves[i]-1] != 0) {
                    int tmp = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0;
                    if (!basket.isEmpty() && tmp == basket.peek()) {
                        answer += 2;
                        basket.pop();
                    } else {
                        basket.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
