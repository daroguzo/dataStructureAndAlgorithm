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
    /*
    public int solution(int[] budgets, int M) {
        int max = 0;
        for (int b : budgets) max = Math.max(max, b);
        return reculsion(budgets, M, 0, max);
    }

    private int reculsion(int[] budgets, int M, int low, int high) {
        int mid = (low + high) / 2;
        if (mid <= low) return low;

        int total = 0;
        for (int i = 0; i < budgets.length; i++) {
            total += Math.min(budgets[i], mid);
        }

        if (total < M) {
            return reculsion(budgets, M, mid + 1, high);
        } else if (total > M) {
            return reculsion(budgets, M, low, mid - 1);
        }

        return mid;
     }
     */
}
