package algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBracketString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new RemoveBracketString().solution(input));
    }

    private String solution(String input) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c :
                input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            }
            else {
                if (stack.isEmpty())
                    answer.append(c);
            }
        }

        return answer.toString();
    }
}
