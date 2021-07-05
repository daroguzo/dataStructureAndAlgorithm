package algorithm.etc;

import java.util.Scanner;

public class Q1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int result = Integer.parseInt(input, 2);
        System.out.println(Integer.toOctalString(result));
    }
}
