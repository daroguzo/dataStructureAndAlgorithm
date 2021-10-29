package algorithm.binarySearch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Budget {
    public int solution(int[] budgets, int M) {
        int answer = 0, left = 0, right;

//        Arrays.sort(budgets);
//        right = budgets[budgets.length - 1];

        right = IntStream.of(budgets).max().orElse(0);

        while (left <= right) {
            final int mid = (left + right) / 2;
            int sum = IntStream.of(budgets)
                    .map(b -> Math.min(b, mid))
                    .sum();
//            for (int b :
//                    budgets) {
//                sum += Math.min(b, mid);
//            }
            if (sum > M) {
                right = mid - 1;
            } else {
                left = mid + 1;
                answer = Math.max(answer, mid);
            }
        }
        return answer;
    }
}
