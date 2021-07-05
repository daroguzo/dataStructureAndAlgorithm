package algorithm.io;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        do{
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }while (a != 0 && b != 0);
    }
}
