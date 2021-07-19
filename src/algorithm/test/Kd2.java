package algorithm.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Kd2 {
    public static void main(String[] args) {
        int[] deposit = {300, 200, -500};
        for (int i :
                new Kd2().solution(deposit)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int[] deposit) {
        Stack<Integer> stack = new Stack<>();
        for (int j : deposit) {
            if (j > 0)
                stack.push(j);
            else {
                if (stack.peek() > Math.abs(j)) {
                    int sum = stack.pop();
                    sum += j;
                    if (sum != 0)
                        stack.push(sum);
                } else if (stack.peek() == Math.abs(j)) {
                    stack.pop();
                } else {
                    int sum = 0;
                    while (sum < Math.abs(j)) {
                        sum += stack.pop();
                    }
                    if(sum != Math.abs(j))
                        stack.push(sum + j);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        Collections.reverse(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
