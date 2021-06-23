package algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new Postfix().solution(input));
    }

    private int solution(String input) {
        Stack<Integer> stack = new Stack<>();
        int answer;
        int x, y;

        for (char c :
                input.toCharArray()) {
            if (Character.isDigit(c))
                stack.push(c - '0');
            else {
                y = stack.pop();
                x = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(x + y);
                        break;
                    case '-':
                        stack.push(x - y);
                        break;
                    case '*':
                        stack.push(x * y);
                        break;
                    case '/':
                        stack.push(x / y);
                        break;
                }
            }
        }
        answer = stack.get(0);
        return answer;
    }
}
