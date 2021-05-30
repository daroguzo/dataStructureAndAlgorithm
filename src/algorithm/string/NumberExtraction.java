package algorithm.string;

import java.util.Scanner;

public class NumberExtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new NumberExtraction().solution(input));
    }

    private int solution(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch :
                input.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
