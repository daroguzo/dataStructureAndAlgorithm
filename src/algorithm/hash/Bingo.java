package algorithm.hash;

import java.util.HashSet;

public class Bingo {
    public int solution(int[][] board, int[] nums) {
        int answer = 0;
        int len = board.length;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n :
                nums) {
            hashSet.add(n);
        }


        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (hashSet.contains(board[i][j])) {
                    board[i][j] = 0;
                }
            }
        }

        answer = horizontalBingo(board) + verticalBingo(board) + diagonalBingo(board) + reverseDiagonalBingo(board);

        return answer;
    }

    int horizontalBingo(int[][] board) {
        int len = board.length, count = 0;;
        for (int i = 0; i < len; i++) {
            int zero = 0;
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 0)
                    zero += 1;
            }
            if (zero == len) {
                count += 1;
            }
        }
        return count;
    }

    int verticalBingo(int[][] board) {
        int len = board.length, count = 0;;
        for (int i = 0; i < len; i++) {
            int zero = 0;
            for (int j = 0; j < len; j++) {
                if (board[j][i] == 0)
                    zero += 1;
            }
            if (zero == len) {
                count += 1;
            }
        }
        return count;
    }

    int diagonalBingo(int[][] board) {
        int len = board.length, count = 0, zero = 0;
        for (int i = 0; i < len; i++) {
            if (board[i][i] == 0) {
                zero += 1;
            }
        }
        if (zero == len) {
            count += 1;
        }

        return count;
    }

    int reverseDiagonalBingo(int[][] board) {
        int len = board.length, count = 0, zero = 0;
        for (int i = 0; i < len; i++) {
            if (board[i][len - 1 - i] == 0) {
                zero += 1;
            }
        }
        if (zero == len) {
            count += 1;
        }

        return count;
    }
}
