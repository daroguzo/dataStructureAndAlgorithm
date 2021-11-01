package algorithm.hash;

import java.util.HashMap;

public class Spy {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String[] clothe : clothes) {
            hashMap.put(clothe[1], hashMap.getOrDefault(clothe[1], 0) + 1);
        }
        for (String key : hashMap.keySet()) {
           answer *= hashMap.get(key) + 1;
        }
        return answer - 1;
    }
}
