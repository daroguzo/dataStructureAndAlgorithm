package algorithm.IO;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", input, i, input*i);
        }
    }
}
