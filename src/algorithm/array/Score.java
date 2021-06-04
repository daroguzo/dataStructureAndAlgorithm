package algorithm.array;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] input = new int[count];
        for (int i = 0; i < count; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(new Score().solution(input));
    }

    private int solution(int[] input) {
        int[] answer = new int[input.length];
        int score = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                answer[i] = ++score;
            } else {
                score = 0;
            }
        }
        score = 0;
        for (int i :
                answer) {
            score += i;
        }
        return score;
    }
}
