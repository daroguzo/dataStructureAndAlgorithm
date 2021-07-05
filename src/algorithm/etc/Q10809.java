package algorithm.etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for (int i = 0; i < input.length(); i++)
            if (alphabet[input.charAt(i)-97] == -1)
                alphabet[input.charAt(i)-97] = i;

        for (int i :
                alphabet) {
            System.out.print(i + " ");
        }
    }
}
