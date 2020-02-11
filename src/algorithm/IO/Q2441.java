package algorithm.IO;

import java.util.Scanner;

public class Q2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = input; i > 0; i--) {
            for (int j = input - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
