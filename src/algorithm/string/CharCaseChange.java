package algorithm.string;

import java.util.Scanner;

public class CharCaseChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input = sc.next();
        for (char ch :
                input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                sb.append(Character.toUpperCase(ch));
            } else  if (ch >= 'A' && ch <= 'Z') {
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);
    }
}
