package algorithm.etc;

public class Skill2 {
    public long solution(int a, int b) {
        if (a > b) {
            int tmp;
            tmp = b;
            b = a;
            a = tmp;
        }
        long answer = 0;
        if (a == b)
            return a;

        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}
