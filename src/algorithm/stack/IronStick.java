package algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new IronStick().solution(input));
    }

    private int solution(String input) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(')
                stack.push('(');
            else {
                stack.pop();
                if (input.charAt(i-1) == '(')
                    answer += stack.size();
                else
                    answer++;
            }
        }
        return answer;
    }
}
