package dataStructure;

import java.util.Scanner;

/**
 * 백준 11720 숫자의 합
 * 220904
 */

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        String y = sc.nextLine();

        x = 0;

        for (char i : y.toCharArray()) {
            x += Character.getNumericValue(i);
        }

        System.out.println(x);
    }
}
