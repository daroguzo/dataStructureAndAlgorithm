package algorithm.simulation;

import java.util.Arrays;

public class NumberGame {
    public int solution(int[] A, int[] B) {
        int answer = 0, i = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int a :
             A) {
            while (i < B.length) {
                if (a < B[i]) {
                    answer++;
                    i += 1;
                    break;
                }
                i += 1;
            }
        }

        // 틀린 접근
        /*
        for (int a :
             A) {
            while (i < B.length) {
                if (answer == 0)
                    return answer;
                System.out.println(a + " " + B[i]);

                if (a >= B[i]) {
                    answer -= 1;
                    i += 1;
                } else {
                    break;
                }
            }
        }
         */

        return answer;
    }
}
