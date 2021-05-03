package dataStructure;

import java.util.HashSet;
import java.util.Set;

public class Array_MatrixZero {
    public static void main(String[] args) {
        int[][] grid = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        new Array_MatrixZero().solve(grid);
    }

    private void solve(int[][] grid) {
        print(grid);
        System.out.println();

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (rowSet.contains(i) || colSet.contains(j)) {
                    grid[i][j] = 0;
                }
            }
        }
        print(grid);
    }

    private void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + grid[i][j] + " ");
            }
            System.out.println();
        }
    }

}
