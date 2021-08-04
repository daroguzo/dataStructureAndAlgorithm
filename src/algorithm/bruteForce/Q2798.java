package algorithm.bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class Q2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cards = new int[n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1 ; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum == m) {
                        answer = m;
                        break;
                    }
                    else if (cards[j] + cards[k] > m){
                        continue;
                    } else {
                        if (sum < m)
                            answer = Math.max(answer, sum);
                    }
                }
            }
        }
        System.out.println(answer);
    }

}
