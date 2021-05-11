package algorithm.string;

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char find = in.next().charAt(0);
        int sum = 0;

        input = input.toUpperCase();
        find = Character.toUpperCase(find);

        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i]) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
