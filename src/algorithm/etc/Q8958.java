package algorithm.etc;

import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        while (count-- > 0) {
            String result = sc.nextLine();
            int score = 0;
            int point = 1;
            for (char c :
                    result.toCharArray()) {
                if (c == 'O') {
                    score += point++;
                } else
                    point = 1;
            }
            System.out.println(score);
        }
    }
}
