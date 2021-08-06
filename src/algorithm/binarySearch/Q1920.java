package algorithm.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Q1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = sc.nextInt();
        }
        Arrays.sort(arrN);

        for (int i = 0; i < m; i++) {
            arrM[i] = search(arrM[i], arrN);
        }

        for (int i :
                arrM) {
            System.out.println(i);
        }
    }
    public static int search(int n, int[] arr) {
        int result = 0, left = 0, right = arr.length - 1, mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if (n == arr[mid]) {
                result = 1;
                break;
            }
            else {
                if (n < arr[mid]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        }
        return result;
    }
}
