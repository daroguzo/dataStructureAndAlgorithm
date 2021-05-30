package algorithm.string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new Palindrome().solution(input));
    }

    private String solution(String input) {
        int lt = 0, rt = input.length() - 1;
        input = input.toUpperCase();
        char[] arr = input.toCharArray();
        for (int i = 0; i < input.length() / 2; i++) {
            if (arr[lt] != arr[rt]) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }
}
