package algorithm.recursive;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new Binary().solution(n);
    }

    private void solution(int n) {
        if (n == 0) {
            return;
        }
        else {
            solution(n / 2);
            System.out.print(n % 2);
        }
    }
}
