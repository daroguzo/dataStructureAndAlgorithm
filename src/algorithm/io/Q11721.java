package algorithm.io;

import java.util.Scanner;

public class Q11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int a;

        str = sc.nextLine();
        a = str.length();
        for (int i = 0; i < a; i++) {
            if(i % 10 != 0)
                System.out.print(str.charAt(i));
            else
                if(i == 0)
                    System.out.print(str.charAt(i));
                else {
                    System.out.println();
                    System.out.print(str.charAt(i));
                }
        }
    }
}
