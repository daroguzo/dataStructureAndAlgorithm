package algorithm.stack;

import java.util.Stack;

public class StackTest1 {
    public static void main(String[] args) {
         String s = "12[a]2[bc]2[d]";
        System.out.println(new StackTest1().solve(s));

    }

    private String solve(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int k = 0;

        for (char c :
                s.toCharArray()) {
             if (Character.isDigit(c)) {
                 k = k * 10 + c - '0';  // 1, 12, 2
             } else if (c == '[') {
                countStack.push(k);
                stringStack.push(result);

                result = new StringBuilder();
                k = 0;
             } else if (c == ']') {
                 StringBuilder str = stringStack.pop();
                 for (int i = countStack.pop(); i > 0; i--) {
                     str.append(result);
                 }
                 result = str;
             } else {
                result.append(c);   // real char
             }
        }
        return result.toString();
    }
}
