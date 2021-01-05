package algorithm.ETC;

import java.util.Scanner;

public class Q2089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int input = sc.nextInt();

        while (input != 0) {
            int rest = input % 2;
            rest = (rest < 0) ? rest * -1 : rest;
            sb.append(rest);

            input = (input - rest) / - 2;
        }
        System.out.println(sb.reverse());
    }
}
