package algorithm.io;

import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, result = 0, y;
        String x;

        input = sc.nextInt();
        sc.nextLine();
        x = sc.nextLine();
        for (int i = 0; i < input; i++) {
            result += x.charAt(i) - '0';
        }
        System.out.println(result);
    }
}
