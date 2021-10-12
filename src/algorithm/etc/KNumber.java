package algorithm.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KNumber {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answerList = new ArrayList<>();
        int[] answer = new int[commands.length];
        int count = commands.length;
        int i = 0;
        while (count-- > 0) {
            int[] newArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(newArray);
            answerList.add(newArray[commands[i][2] - 1]);
            i++;
        }

        for (int j = 0; j < commands.length; j++) {
            answer[j] = answerList.get(j);
        }
        return answer;
    }
}
