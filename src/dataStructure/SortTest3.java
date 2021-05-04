package dataStructure;

import java.util.PriorityQueue;

public class SortTest3 {
    public static void main(String[] args) {
        SortTest3 a = new SortTest3();
        int[] sticks = {1, 8, 2, 5};
        System.out.println(a.pqSticks(sticks));
    }

    private int pqSticks(int[] sticks) {
        // minHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i :
                sticks) {
            pq.offer(i);
        }

        int sum = 0;
        while (pq.size() > 1) {
            int twoSum = pq.poll() + pq.poll();
            sum += twoSum;  // 3 + 8 + 16
            pq.offer(twoSum);
        }

        return sum;
    }
}
