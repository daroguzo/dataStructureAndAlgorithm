package algorithm.ETC;

import java.util.ArrayList;
import java.util.Collections;

public class Skill {
    public static void main(String[] args) {
        int[] answer = {};
        answer[0] = 0;
        answer[1] = 1;
        answer[2] = 2;

        for (int i:
             answer) {
            System.out.println(i);
        }
    }

    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
                list.add(arr[i]);
            }
        }
        if (count == 0) {
            return new int[] {-1};
        }
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
