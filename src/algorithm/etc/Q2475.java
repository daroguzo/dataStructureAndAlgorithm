package algorithm.etc;

import java.util.Scanner;

public class Q2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i :
                numbers) {
            sum += i * i;
        }
        System.out.println(sum % 10);
    }
}

