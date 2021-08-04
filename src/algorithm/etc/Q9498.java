package algorithm.etc;

import java.util.Scanner;

public class Q9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char answer = 'F';
        if (score <= 100 && score >= 90)
            answer = 'A';
        else if (score <= 89 && score >= 80)
            answer = 'B';
        else if (score <= 79 && score >= 70)
            answer = 'C';
        else if (score <= 69 && score >= 60)
            answer = 'D';

        System.out.println(answer);
    }
}
