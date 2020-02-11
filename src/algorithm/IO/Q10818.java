package algorithm.IO;

import java.util.Scanner;

public class Q10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] numbers = new int[input];
        int min = 1000000, max = -1000000;
        for (int i = 0; i < input; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < input; i++) {
            if(min > numbers[i])
                min = numbers[i];
            if(max < numbers[i])
                max = numbers[i];
        }
        System.out.println(min + " " + max);
    }
}
