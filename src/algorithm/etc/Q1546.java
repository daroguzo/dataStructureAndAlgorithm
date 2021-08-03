package algorithm.etc;

import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] scores = new double[n];
        double max = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        for (double i :
                scores) {
            if (i > max)
                max = i;
        }
        for (double d :
                scores) {
            sum += d/max;
        }
        System.out.println(sum/n * 100);
    }
}
