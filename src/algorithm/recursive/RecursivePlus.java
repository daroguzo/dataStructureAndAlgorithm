package algorithm.recursive;

import java.util.Scanner;

public class RecursivePlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new RecursivePlus().solution(n);
    }

    private void solution(int n) {
        if (n == 0)
            return;
        else {
            solution(n - 1);
            System.out.print(n + " ");
        }

    }
}
