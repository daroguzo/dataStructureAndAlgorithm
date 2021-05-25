package algorithm.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new RemoveDuplicate().solution2(input));
    }

    private String solution(String input) {
        Set<Character> set = new HashSet<>();
        char[] arr = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch :
                arr) {
            if (!set.contains(ch)) {
                sb.append(ch);
            }
            set.add(ch);
        }
        return sb.toString();
    }

    private String solution2(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (i == input.indexOf(input.charAt(i))) {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }
}
