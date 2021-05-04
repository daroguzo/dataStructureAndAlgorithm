package dataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 5, 5, 5, 5};
        int k = 2;
        System.out.println(new MapTest2().solve(nums, k));
    }

    private List<Integer> solve(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] list = new List[nums.length + 1];
        List<Integer> result = new ArrayList<>();

        for (int i :
                nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key :
                map.keySet()) {
            // value 가져오기
            int topFrequent = map.get(key);
            if (list[topFrequent] == null) {
                list[topFrequent] = new ArrayList<>();
            }
            // key
            list[topFrequent].add(key);
        }
        for (int lastIndex = list.length - 1; lastIndex >= 0; lastIndex--) {
            if (list[lastIndex] != null) {
                for (int i = 0; i < list[lastIndex].size() && result.size() < k; i++) {
                    result.add(list[lastIndex].get(i));
                }
            }
        }
        return result;
    }
}
