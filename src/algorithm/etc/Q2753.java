package algorithm.etc;

import java.util.Scanner;

public class Q2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0)
            answer = 1;
        System.out.println(answer);
    }
}
