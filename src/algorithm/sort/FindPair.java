package algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }
        new FindPair().solution(n, students);
    }

    private void solution(int n, int[] students) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] pre = students.clone();

        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            if (students[i] != pre[i])
                answer.add(i+1);
        }

        for (int i :
                answer) {
            System.out.print(i + " ");
        }
    }
}
