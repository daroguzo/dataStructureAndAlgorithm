package algorithm.dfs;

import java.util.Stack;

public class PossibleBracket {
    int answer = 0;
    public int solution(int n) {
        dfs(0, 0, n);
        return answer;
    }

    private void dfs(int left, int right, int n) {
        if (left < right) {
            return;
        }

        if (left == n && right == n) {
            answer++;
            return;
        }
        if (left > n) {
            return;
        }

        dfs(left + 1, right, n);
        dfs(left, right + 1, n);
    }

    static class P {
        int open, close;

        public P(int open, int close) {
            this.open = open;
            this.close = close;
        }
    }

    public int solution2(int n) {
        int answer = 0;

        Stack<P> stack = new Stack<>();
        stack.push(new P(0, 0));
        while (!stack.isEmpty()) {
            P p = stack.pop();

            if (p.open > n) continue;
            if (p.open < p.close) continue;
            if (p.open + p.close == 2 * n) {
                answer++;
                continue;
            }

            stack.push(new P(p.open + 1, p.close));
            stack.push(new P(p.open, p.close + 1));
        }

        return answer;
    }
}
