package algorithm.sort;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MostBigNumber {
    public String solution(int[] numbers) {

        String answer = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2))
                .collect(Collectors.joining());

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
