package algorithm.ETC;

import java.util.Scanner;

public class Q2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        int result = 0;

        for (int i = 0; i < a.length(); i++){
            if ('0' <= a.charAt(i) && a.charAt(i) <= '9'){
                result = result * b + ((int)a.charAt(i) - (int)'0');
            }
            else{
                result = result * b + ((int)a.charAt(i) - (int)'A' + 10);
            }
        }
        System.out.println(result);
    }
}
