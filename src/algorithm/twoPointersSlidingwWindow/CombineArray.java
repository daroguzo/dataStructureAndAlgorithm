package algorithm.twoPointersSlidingwWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        new CombineArray().solution2(array1, array2);
    }

    private void solution(int[] array1, int[] array2) {
        int n = array1.length + array2.length;
        int[] combined = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < array1.length)
                combined[i] = array1[i];
            else
                combined[i] = array2[i-array1.length];
        }

        Arrays.sort(combined);

        for (int i :
                combined) {
            System.out.print(i + " ");
        }
    }

    private void solution2(int[] array1, int[] array2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < array1.length && p2 < array2.length) {
            if (array1[p1] < array2[p2])
                answer.add(array1[p1++]);
            else
                answer.add(array2[p2++]);
        }

        while (p1 < array1.length)
            answer.add(array1[p1++]);
        while (p2 < array2.length)
            answer.add(array2[p2++]);

        for (int i:
             answer) {
            System.out.print(i + " ");
        }
    }
}
