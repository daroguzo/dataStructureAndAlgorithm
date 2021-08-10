package algorithm.etc;

import java.util.Scanner;

public class Q2609 {
    static int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, gcd, lcm;
        a = sc.nextInt();
        b = sc.nextInt();
        gcd = gcd(a, b);
        lcm = (a * b / gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
