package algorithm.ETC;

import java.util.Scanner;

public class Q1850 {
    static long gcd(long a, long b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        long gcd = gcd(Math.max(num1, num2), Math.min(num1, num2));

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= gcd; i++) sb.append("1");

        System.out.println(sb.toString());
    }
}