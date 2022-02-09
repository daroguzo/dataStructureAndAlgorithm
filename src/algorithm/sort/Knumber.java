package algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Knumber {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {
                {2,5,3},
                {4,4,1},
                {1,7,3}
        };
        Knumber knumber = new Knumber();
        for (int i : knumber.solution(array, commands)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> sortedArr = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] command : commands) {
            for (int j = command[0] - 1; j < command[1]; j++) {
                sortedArr.add(array[j]);
            }
            Collections.sort(sortedArr);
            list.add(sortedArr.get(command[2] - 1));
            sortedArr.clear();
        }
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
