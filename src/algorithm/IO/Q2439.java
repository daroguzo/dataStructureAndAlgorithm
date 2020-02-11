package algorithm.IO;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = input - (i+1); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
