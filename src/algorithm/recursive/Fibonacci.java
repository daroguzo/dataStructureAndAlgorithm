package algorithm.recursive;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new Fibonacci().solution(n));
    }

    private int solution(int n) {
        if (n == 1)
            return 1;
        else if(n == 2)
            return 1;
        else
            return solution(n-2) + solution(n-1);
    }
}
