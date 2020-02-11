package algorithm.IO;

import java.util.Scanner;

public class Q11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, a, b;
        input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Case #" + (i+1) + ": " + a + " + " + b +  " = " + (a+b));
        }
    }
}
