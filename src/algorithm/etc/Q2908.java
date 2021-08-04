package algorithm.etc;

import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        String a = arr[0];
        String b = arr[1];
        sb1.append(a).reverse();
        sb2.append(b).reverse();

        int intA = Integer.parseInt(sb1.toString());
        int intB = Integer.parseInt(sb2.toString());

        System.out.println(Math.max(intA, intB));

    }
}
