package algorithm.ETC;

import java.util.Scanner;

public class Q11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if(arr[i] >= 'a' && arr[i] <= 'm')
                arr[i] += 13;
            else if(arr[i] >= 'n' && arr[i] <= 'z')
                arr[i] -= 13;
            else if(arr[i] >= 'A' && arr[i] <= 'M')
                arr[i] += 13;
            else if(arr[i] >= 'N' && arr[i] <= 'Z')
                arr[i] -= 13;
        }
        System.out.println(arr);
    }
}
