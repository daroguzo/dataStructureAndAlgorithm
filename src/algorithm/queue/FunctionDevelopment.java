package algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FunctionDevelopment {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0, sum = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int truck :
                truck_weights) {
            while (true) {
                if (queue.isEmpty()) {
                    queue.offer(truck);
                    sum += truck;
                    answer += 1;
                    break;
                } else if (queue.size() == bridge_length) {
                    sum -= queue.poll();
                } else {
                    if (sum + truck > weight) {
                        queue.add(0);
                        answer += 1;
                    } else {
                        queue.add(truck);
                        sum += truck;
                        answer += 1;
                        break;
                    }
                }
            }
        }
        return answer + bridge_length;
    }
}
