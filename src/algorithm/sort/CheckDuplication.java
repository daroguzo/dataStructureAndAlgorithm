package algorithm.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CheckDuplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }
        System.out.println(new CheckDuplication().solution(n, students));
    }

    private char solution(int n, int[] students) {

        Arrays.sort(students);
        for (int i = 0; i < n - 1; i++) {
            if (students[i] == students[i+1])
                return 'D';
        }
        
        return 'U';
    }

    private char solutionHash(int n, int[] students) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(students[i]))
                return 'D';
            hashMap.put(students[i], 0);
        }
        return 'U';
    }
}
