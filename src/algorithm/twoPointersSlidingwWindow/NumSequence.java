package algorithm.twoPointersSlidingwWindow;

import java.util.Scanner;

public class NumSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }

        System.out.println(new NumSequence().solution(n, m, seq));
    }

    private int solution(int n, int m, int[] seq) {
        int answer = 0, sum = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += seq[rt];
            if (sum == m)
                answer++;

            while (sum >= m) {
                sum -= seq[lt++];
                if (sum == m)
                    answer++;
            }
        }

        return answer;
    }

}
