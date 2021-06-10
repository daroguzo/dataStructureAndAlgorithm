package algorithm.twoPointersSlidingwWindow;

import java.util.*;

public class CommonElement {
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

        new CommonElement().solution(array1, array2);
    }

    private void solution(int[] array1, int[] array2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(array1);
        Arrays.sort(array2);

        while (p1 < array1.length && p2 < array2.length) {
            if (array1[p1] == array2[p2]) {
                answer.add(array1[p1++]);
                p2++;
            }
            else if (array1[p1] < array2[p2])
                p1++;
            else
                p2++;
        }

        for (int i :
                answer) {
            System.out.print(i + " ");
        }
    }
}
