package algorithm.etc;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 1;
        while (!(a == 0 && b == 0)) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (!(a == 0 && b == 0))
                System.out.println(a + b);
        }
    }
}
