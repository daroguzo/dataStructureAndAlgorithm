package algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new Bracket().solution(input));
    }

    private String solution(String input) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char c :
                input.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            if (stack.pop() == ')')
                count++;
            else
                count--;

            if (count < 0) {
                return "NO";
            }
        }

        if (count == 0)
            return "YES";
        else
            return "NO";
    }

    private String solution2(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c :
                input.toCharArray()) {
            if (c == '(')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty())
            return "NO";

        return "YES";
    }
}
