package algorithm.io;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < input+1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
