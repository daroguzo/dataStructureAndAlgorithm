package algorithm.io;

import java.util.Scanner;

public class Q2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = input-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = input-i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
