package algorithm.string;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String input = sc.next();
        System.out.println(new Password().solution(count, input));
    }

    private String solution (int count, String input) {
        String[] arr = new String[count];
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.substring(0, 7);
            input = input.substring(7);
        }

        for (String s : arr) {
            char[] tmp = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : tmp) {
                if (c == '#')
                    sb.append('1');
                else
                    sb.append('0');
            }
            int i = Integer.parseInt(sb.toString(), 2);
            answer.append((char)i);
        }

        return answer.toString();
    }
}
