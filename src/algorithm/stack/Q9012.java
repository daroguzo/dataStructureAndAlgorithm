package algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            Stack<Character> stack = new Stack<>();
            String ps = sc.nextLine();
            String answer = "YES";
            for (char c :
                    ps.toCharArray()) {
                if (c == '(')
                    stack.push(c);
                else {
                    if (stack.isEmpty()) {
                        answer = "NO";
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.isEmpty())
                answer = "NO";
            System.out.println(answer);
        }
    }
}
