package algorithm.simulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameItem {
    public int[] solution(int[] healths, int[][] items) {
        int[] answer = {};
        List<Integer> itemList = new ArrayList<>();
        int minHealth = Arrays.stream(healths).min().getAsInt();

        for (int i = 0; i < items.length; i++) {
            if (items[i][1] - 100 < minHealth) {
                itemList.add(i + 1);
            }
        }

        answer = new int[itemList.size()];

        for (int i = 0; i < itemList.size(); i++) {
            answer[i] = itemList.get(i);
        }
        return answer;
    }
}
