package algorithm.string;

import java.util.Scanner;

public class NumberDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char ch = sc.next().charAt(0);
        new NumberDistance().solution(input, ch);
    }

    private void solution(String input, char ch) {
        int d = 1000;
        int[] answer = new int[input.length()];
        int[] arr = new int[input.length()];
        char[] s = input.toCharArray();
        answer[0] = d;

        for (int i = 0; i < input.length(); i++) {
            if (s[i] == ch) {
                answer[i] = 0;
                d = 0;
            } else {
                answer[i] = ++d;
            }
        }

        d = 1000;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (s[i] == ch) {
                d = 0;
            } else {
                arr[i] = ++d;
            }
        }

        for (int i = 0; i < input.length(); i++) {
            answer[i] = Integer.min(answer[i], arr[i]);
        }

        for (int i :
                answer) {
            System.out.print(i + " ");
        }
    }
}
