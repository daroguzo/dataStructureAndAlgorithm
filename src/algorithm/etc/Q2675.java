package algorithm.etc;

import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int time = sc.nextInt();
            String s = sc.nextLine();
            s = s.trim();
            StringBuilder sb = new StringBuilder();
            for (char c :
                    s.toCharArray()) {
                for (int i = 0; i < time; i++) {
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }
}
