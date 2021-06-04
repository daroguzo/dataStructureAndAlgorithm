package algorithm.array;

import java.util.Scanner;

public class MaxTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = sc.nextInt();
            }
        }
        System.out.println(new MaxTable().solution(n, table));
    }

    private int solution(int n, int[][] table) {
        int max = 0;
        int sum = 0;
        // row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += table[i][j];
            }
            if (sum > max)
                max = sum;
            sum = 0;
        }

        // col
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += table[j][i];
            }
            if (sum > max)
                max = sum;
            sum = 0;
        }

        // dia
        for (int i = 0; i < n; i++) {
            sum += table[i][i];
        }
        if (sum > max)
            max = sum;
        sum = 0;

        for (int i = 0, j = n-1; i < n && j > 0; i++, j--) {
            sum += table[i][j];
        }
        if (sum > max)
            max = sum;

        return max;
    }
}
