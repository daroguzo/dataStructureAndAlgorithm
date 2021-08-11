package algorithm.etc;

import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a * b;
        for (int i = 0; i < 3; i++) {
            int tmp = b % 10;
            System.out.println(tmp * a);
            b /= 10;
        }
        System.out.println(mul);
    }
}
