package algorithm.dfs;

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
}
