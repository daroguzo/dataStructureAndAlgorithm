package algorithm.array;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lotto = new int[6];
        int[] win = new int[6];
        for (int i = 0; i < 6; i++) {
            lotto[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            win[i] = sc.nextInt();
        }
        for (int i :
                new Lottery().solution(lotto, win)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int zero = 0;
        boolean[] correct = new boolean[46];

        for (int i = 0; i < 6; i++) {
            correct[win_nums[i]] = true;
        }

        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0)
                zero++;

            if (correct[lottos[i]])
                count++;
        }

        return new int[] {getRank(zero + count), getRank(count)};
    }

    private int getRank(int count) {
        if (count == 0)
            return 6;
        return 7-count;
    }
}
