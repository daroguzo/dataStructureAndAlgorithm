package dataStructure;

import java.util.Scanner;

/**
 * 백준 1546 평균
 * 220904
 */

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        float[] scores = new float[times];
        float max = 0;
        float sum = 0;

        for (int i = 0; i < times; i++) {
            scores[i] = scanner.nextInt();
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        for (int i = 0; i < times; i++) {
            scores[i] = scores[i] / max * 100;
            sum += scores[i];
        }

        System.out.println(sum / times);
    }
}
