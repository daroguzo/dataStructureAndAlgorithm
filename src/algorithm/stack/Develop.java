package algorithm.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Develop {
    public static void main(String[] args) {
        int[] p = {93, 30, 55};
        int[] s = {1, 30, 5};
        System.out.println(Arrays.toString(new Develop().solution(p, s)));
    }
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        int distribution = (int)Math.ceil((100 - progresses[0]) / (double)speeds[0]);
        queue.offer(distribution);

        for (int i = 1; i < progresses.length; i++) {
            int newDistribution = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]);
            if (distribution <= newDistribution) {
                distribution = newDistribution;
            }
            queue.offer(distribution);
        }
        int day = queue.poll();
        while (!queue.isEmpty()) {
            if (queue.peek() == day) {
                count++;
                queue.poll();
            } else {
                list.add(count);
                count = 1;
                day = queue.poll();
            }
        }
        list.add(count);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
