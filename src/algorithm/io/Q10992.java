package algorithm.io;

import java.util.Scanner;

public class Q10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = input; j > i; j--) {
                System.out.print(" ");
            }
            if(i == input) {
                for (int j = 0; j < input * 2 - 1; j++) {
                    System.out.print("*");
                }
                break;
            }
            for (int j = 0; j < i*2-1; j++) {
                if(j == 0)
                    System.out.print("*");
                else if(j == (i*2-1)-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
