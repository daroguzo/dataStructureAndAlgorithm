package algorithm.string;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input += " ";
        System.out.println(new StringCompression().solution(input));
    }

    private String solution(String input) {
        StringBuilder answer = new StringBuilder();
        char[] arr = input.toCharArray();
        int count = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (arr[i] == arr[i+1]) {
                count++;
            } else {
                answer.append(arr[i]);
                if (count != 1)
                    answer.append(count);
                count = 1;
            }
        }

        return answer.toString();
    }
}
