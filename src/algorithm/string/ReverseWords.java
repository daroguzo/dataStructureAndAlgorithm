package algorithm.string;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s;
        while (t-- > 0) {
            s = sc.next();
            System.out.println(new ReverseWords().solution(s));
        }
    }

    private String solution(String s) {
        StringBuilder sb = new StringBuilder();
//        char[] arr = s.toCharArray();
//        for (int i = s.length() - 1; i >=  0; i--) {
//            sb.append(arr[i]);
//        }
        return sb.append(s).reverse().toString();
    }
}
