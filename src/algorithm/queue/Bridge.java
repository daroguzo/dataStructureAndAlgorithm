package algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Bridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0, sum = 0;
        Queue<Integer> bridge = new LinkedList<>();

        for (int truck : truck_weights) {
            while (true) {
                if (bridge.isEmpty()) {
                    bridge.offer(truck);
                    sum += truck;
                    time++;
                    break;
                } else if (bridge.size() == bridge_length) {
                    sum -= bridge.poll();
                } else {
                    if (sum + truck > weight) {
                        bridge.offer(0);
                        time++;
                    } else {
                        bridge.offer(truck);
                        sum += truck;
                        time++;
                        break;
                    }
                }
            }
        }
        return time + bridge_length;
    }
}
