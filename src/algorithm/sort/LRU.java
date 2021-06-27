package algorithm.sort;

import java.util.Scanner;

public class LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] tasks = new int[n];
        for (int i = 0; i < n; i++) {
            tasks[i] = sc.nextInt();
        }
        new LRU().solution(s, n, tasks);
    }

    private void solution(int s, int n, int[] tasks) {
        int[] cache = new int[s];

        for (int i :
                tasks) {
            int index = -1;

            for (int j = 0; j < s; j++) {
                if (cache[j] == i)
                    index = j;
            }

            if (index == -1) {
                for (int j = s-1; j >= 1; j--) {
                    cache[j] = cache[j-1];
                }
                cache[0] = i;
            } else {
                for (int j = index; j >= 1; j--) {
                    cache[j] = cache[j-1];
                }
                cache[0] = i;
            }
        }
        for (int i :
                cache) {
            System.out.print(i + " ");
        }
    }
}
