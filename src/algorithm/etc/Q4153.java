package algorithm.etc;

import java.util.Scanner;

public class Q4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        String answer = "wrong";
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if ((a == 0 && b == 0 && c == 0)) {
                break;
            }
            if (a*a + b*b == c*c)
                answer = "right";
            if (a*a + c*c == b*b)
                answer = "right";
            if (c*c + b*b == a*a)
                answer = "right";
            System.out.println(answer);
            answer = "wrong";
        }
    }
}
