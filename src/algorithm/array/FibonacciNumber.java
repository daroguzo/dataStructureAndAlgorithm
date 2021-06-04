package algorithm.array;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        new FibonacciNumber().solution(input);
    }

    private void solution(int input) {
        int[] answer = new int[input];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < input; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        for (int i :
                answer) {
            System.out.print(i + " ");
        }
    }
}
