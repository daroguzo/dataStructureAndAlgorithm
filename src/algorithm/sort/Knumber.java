package algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Knumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> sortedArr = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                sortedArr.add(array[j]);
            }
            Collections.sort(sortedArr);
            System.out.println(sortedArr);
            list.add(sortedArr.get(commands[i][2] - 1));
            sortedArr.clear();
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
