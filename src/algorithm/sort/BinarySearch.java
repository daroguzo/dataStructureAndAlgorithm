package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(new BinarySearch().solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0, lt = 0, rt = n-1;
        Arrays.sort(arr);

        while (lt <= rt) {
            int middle = (lt + rt) / 2;
            if (arr[middle] == m) {
                answer = middle + 1;
                break;
            }
            if (arr[middle] > m) {
                rt = middle - 1;
            } else {
                lt = middle + 1;
            }
        }

        return answer;
    }
}
