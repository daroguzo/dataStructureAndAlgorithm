package algorithm.hash;

import java.util.HashMap;

public class BoardGame {
    public int solution(int[] monster, int S1, int S2, int S3) {
        int count = 0, monsterSum = 0;
        double answer = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    int sum = i + j + k + 1;
                    count += 1;
                    hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
                }
            }
        }

        for (int m :
                monster) {
            if (hashMap.containsKey(m)) {
                monsterSum += hashMap.get(m);
            }
        }
        answer = ((double)(count - monsterSum) / (double)count) * 1000;

        return (int) answer;
    }
}
