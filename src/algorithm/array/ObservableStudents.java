package algorithm.array;

import java.util.Scanner;

public class ObservableStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(new ObservableStudents().solution(count, arr));
    }

    private int solution(int count, int[] arr) {
        int answer = 1;
        int max = arr[0];

        for (int i = 1; i < count; i++) {
            if (arr[i - 1] < arr[i] && max < arr[i]) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }
}
