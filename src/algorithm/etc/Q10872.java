package algorithm.etc;

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = 1;

        if(input > 1){
            for (int i = 2; i <= input; i++) {
                result *= i;
            }
        }
        System.out.println(result);
    }
}
