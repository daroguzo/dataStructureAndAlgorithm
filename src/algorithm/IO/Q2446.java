package algorithm.IO;

import java.util.Scanner;

public class Q2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i*2-1; j <= input*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= input; i++) {
            for (int j = input; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
