package algorithm.heap;

import java.util.PriorityQueue;

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i :
                scoville) {
            heap.add(i);
        }

        while (heap.peek() < K) {
            if (heap.size() == 1) {
                return -1;
            }
            int notSpicy1 = heap.poll();
            int notSpicy2 = heap.poll();
            int mix = notSpicy1 + (notSpicy2 * 2);
            heap.add(mix);
            answer++;
        }

        return answer;
    }
}
