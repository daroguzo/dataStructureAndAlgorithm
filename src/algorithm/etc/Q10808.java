package algorithm.etc;

import java.util.Scanner;

public class Q10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < input.length(); i++)
            alphabet[input.charAt(i)-97]++;

        for (int i :
                alphabet) {
            System.out.print(i + " ");
        }
    }
}
