package algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintMax {
    public static void main(String[] args) {
        PrintMax p = new PrintMax();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x :
                p.solution(count, arr)) {
            System.out.print(x + " ");
        }
    }

    private ArrayList<Integer> solution(int count, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < count; i++) {
            if (arr[i] > arr[i-1])
                answer.add(arr[i]);
        }

        return answer;
    }
}
