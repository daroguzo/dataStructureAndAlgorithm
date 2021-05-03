package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class Array_subArraySum_Map {
    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
        System.out.println(new Array_subArraySum_Map().solve(nums, k));
    }

    private int solve(int[] nums, int k) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+ 1);
        }
        return count;
    }
}
