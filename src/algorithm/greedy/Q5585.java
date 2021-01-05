package algorithm.greedy;

import java.util.Scanner;

public class Q5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change = sc.nextInt();
        change = 1000 - change;
        int count = 0;
        int[] coins = {500, 100, 50, 10, 5, 1};
        for (int coin :
                coins) {
            count += change / coin;
            change %= coin;
        }
        System.out.println(count);
    }
}
