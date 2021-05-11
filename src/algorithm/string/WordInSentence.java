package algorithm.string;

import java.util.Scanner;

public class WordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new WordInSentence().solution(input));
    }

    private String solution(String input) {
        String answer = "";
        int maxSize = 0;

        String[] array = input.split(" ");
        for (String s :
                array) {
            if (s.length() > maxSize) {
                maxSize = s.length();
                answer = s;
            }
        }

        return answer;
    }
}
