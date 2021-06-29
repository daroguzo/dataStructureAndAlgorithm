package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Stall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }
        System.out.println(new Stall().solution(n, c, points));
    }

    private int solution(int n, int c, int[] points) {
        int answer = 0;
        Arrays.sort(points);
        int lt = 1;
        int rt = points[n-1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(points, mid) >= c ) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    private int count(int[] points, int distance) {
        int cnt = 1;
        int ep = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i] - ep >= distance) {
                cnt++;
                ep = points[i];
            }
        }
        return cnt;
    }
}
