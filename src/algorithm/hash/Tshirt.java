package algorithm.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Tshirt {
    public int solution(int[] people, int[] tshirts) {
        int answer = 0;
        Arrays.sort(tshirts);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int p : people) {
            hashMap.put(p, hashMap.getOrDefault(p, 0) + 1);
        }

        for (int t : tshirts) {
            if (hashMap.containsKey(t)) {
                if (hashMap.get(t) != 0) {
                    hashMap.put(t, hashMap.get(t) - 1);
                    answer++;
                }
            }
        }
        System.out.println(hashMap);
        return answer;
    }
}