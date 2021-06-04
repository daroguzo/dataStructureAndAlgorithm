package algorithm.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        new Rank().solution(arr);
    }

    private void solution(int[] arr) {
        Integer[] rank = new Integer[arr.length];
        int count = 0;
        for (int i = 0; i < rank.length; i++) {
            rank[i] = arr[i];
        }

        Arrays.sort(rank, Collections.reverseOrder());

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                if (rank[j] == arr[i] && count == 0) {
                    System.out.print(j+1 + " ");
                    count++;
                }
            }
            count = 0;
        }
    }
}