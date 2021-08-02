package algorithm.etc;

import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int min = Integer.MIN_VALUE;
        int answer = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            if (arr[i] > min) {
                min = arr[i];
                answer = i;
            }
        }
        System.out.println(min);
        System.out.println(answer + 1);
    }
}
