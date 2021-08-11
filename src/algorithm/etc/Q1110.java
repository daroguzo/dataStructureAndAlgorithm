package algorithm.etc;

import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new Q1110().solution(n));
    }

    private int solution(int n) {
        if (n == 0)
            return 1;
        int answer = n;
        int count = 0;
        do {
            int a = answer / 10;
            int b = answer % 10;
            int plus = a + b;
            answer = b * 10 + plus % 10;
            count++;
        } while (answer != n);
        return count;
    }
}
