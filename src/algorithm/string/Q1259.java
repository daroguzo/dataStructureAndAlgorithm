package algorithm.string;

import java.util.Scanner;

public class Q1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        String answer = "yes";
        while (!input.equals("0")) {
            input = sc.nextLine();
            char[] arr = input.toCharArray();
            int lt = 0, rt = arr.length - 1;
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[lt] != arr[rt]) {
                    answer = "no";
                    break;
                }
                lt++;
                rt--;
            }
            if (!input.equals("0"))
                System.out.println(answer);
            answer = "yes";
        }
    }
}
