package algorithm.etc;

import java.util.Scanner;

public class Q11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int i = 2;
        while(input >= i) {
            if(input % i == 0) {
                System.out.println(i);
                input /= i;
            } else {
                i++;
            }
        }
    }
}
