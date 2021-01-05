package algorithm.ETC;

import java.util.Arrays;
import java.util.Scanner;

public class Q11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        String[] lengthArr = new String[length];

        for (int i = 0; i < length; i++)
            lengthArr[i] = input.substring(i, length);

        Arrays.sort(lengthArr);

        for (String i :
                lengthArr) {
            System.out.println(i);
        }
    }
}
