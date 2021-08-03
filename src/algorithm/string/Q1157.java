package algorithm.string;

import java.util.*;

public class Q1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toUpperCase();
        int count = 0;
        char answer = '?';
        int[] alphabet = new int[26];
        for (char c :
                input.toCharArray()) {
            alphabet[c - 'A']++;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (count < alphabet[i]) {
                count = alphabet[i];
                answer = (char) (i + 'A');
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (i == answer - 'A')
                continue;
            if (alphabet[i] == count)
                answer = '?';
        }
        System.out.println(answer);
    }
}
