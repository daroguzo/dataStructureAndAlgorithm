package algorithm.ETC;

import java.util.Scanner;

public class Q2609 {
    static int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int a, b, gcd, lcm;
        for (int i = 0; i < count; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            gcd = gcd(a, b);
            lcm = (a * b / gcd);
            System.out.println(lcm);
        }
    }
}
