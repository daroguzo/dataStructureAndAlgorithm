package algorithm.IO;

import java.util.Scanner;

public class Q10991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = input; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                if(j%2 == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
