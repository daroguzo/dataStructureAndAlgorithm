package algorithm.io;

import java.util.Scanner;

public class Q11021 {
    public static void main(String[] args) {
        int count, a, b;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Case #" + (i+1) + ": " + (a+b));
        }
    }
}
