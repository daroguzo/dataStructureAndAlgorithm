package algorithm.string;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new Palindrome2().solution(input));
    }

    private String solution(String input) {
        StringBuilder sb = new StringBuilder();
        char[] arr = input.toLowerCase().toCharArray();

        for (char ch :
                arr) {
            if (Character.isAlphabetic(ch)) {
                sb.append(ch);
            }
        }
        int lt = 0, rt = sb.length() - 1;
        char[] arr2 = sb.toString().toCharArray();

        for (int i = 0; i < sb.length() / 2; i++) {
            if (arr2[lt] != arr2[rt]) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }
}
