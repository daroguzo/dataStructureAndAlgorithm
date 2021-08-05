package algorithm.etc;

import java.util.Scanner;

public class Q11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer = factorial(n) / (factorial(n - k) * factorial(k));

        System.out.println(answer);
    }
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1 );
    }
}
