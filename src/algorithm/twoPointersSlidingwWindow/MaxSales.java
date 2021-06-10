package algorithm.twoPointersSlidingwWindow;

import java.util.Scanner;

public class MaxSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sales = new int[n];
        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }
        System.out.println(new MaxSales().solution(n, k, sales));
    }

    private int solution(int n, int k, int[] sales) {
        int sum = 0;
        int answer;
        for (int i = 0; i < k; i++) {
            sum += sales[i];
        }
        answer = sum;

        for (int i = k; i < n; i++) {
            sum += sales[i];
            sum -= sales[i-k];
            answer = Math.max(sum, answer);
        }

        return answer;
    }
}
