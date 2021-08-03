package algorithm.string;

import java.util.Scanner;

public class Q1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int answer = 1;
        input = input.trim();
        for (char c :
                input.toCharArray()) {
            if (c == ' ')
                answer++;
        }
        if (input.equals(""))
            answer = 0;
        System.out.println(answer);
    }
}
