package algorithm.IO;

import java.util.Scanner;

public class Q2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = input * 2 - (i*2); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = input-1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = input * 2 - (i*2); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
