package algorithm.twoPointersSlidingwWindow;

import java.util.Scanner;

public class SumSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new SumSequence().solution(n));
    }

    private int solution(int n) {
        int answer = 0, lt = 0, m = n/2+1, sum = 0;
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = i+1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }

    private int solution2(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0)
                answer++;
        }
        return answer;
    }
}
