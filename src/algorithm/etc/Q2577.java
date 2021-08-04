package algorithm.etc;

import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[3];
        int[] numbers = new int[10];
        int multiple = 1;
        for (int i = 0; i < 3; i++) {
            input[i] = sc.nextInt();
        }
        for (int i :
                input) {
            multiple *= i;
        }
        String number = String.valueOf(multiple);
        for (int i = 0; i < number.length(); i++) {
            numbers[number.charAt(i) - '0']++;
        }
        for (int i :
                numbers) {
            System.out.println(i);
        }
    }
}
