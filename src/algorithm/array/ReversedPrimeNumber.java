package algorithm.array;

import java.util.Scanner;

public class ReversedPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] input = new int[count];
        for (int i = 0; i < count; i++) {
            input[i] = sc.nextInt();
        }
        new ReversedPrimeNumber().solution(input);
    }

    private void solution(int[] input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(sb.append(input[i]).reverse().toString());
            sb = new StringBuilder();
        }
        for (int i :
                input) {
            if (isPrimeNumber(i))
                System.out.print(i + " ");
        }
    }

    private boolean isPrimeNumber(int x) {
        if (x == 1)
            return false;
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
