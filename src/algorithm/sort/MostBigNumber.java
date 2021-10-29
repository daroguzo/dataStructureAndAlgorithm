package algorithm.sort;

import java.util.Arrays;
import java.util.Comparator;

public class MostBigNumber {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (arr[0].startsWith("0")) {
            return "0";
        }

        for (String s :
                arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}