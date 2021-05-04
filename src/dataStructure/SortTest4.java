package dataStructure;

import java.util.*;

public class SortTest4 {
    public static void main(String[] args) {
//        String[] words= {"i", "study", "inflearn", "i", "study", "coding"};
        int k = 2;
        String[] words = {"a", "b", "c", "a", "b", "c", "a"};
        SortTest4 a = new SortTest4();
        System.out.println(a.solve(words, k));
    }

    private static List<String> solve(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (String w :
                words) {
            map.put(w, map.getOrDefault(w, 0) +1 ); // a3 b2 c2
        }

        Queue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a,b) ->
                a.getValue().equals(b.getValue()) ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue());

        for (Map.Entry<String, Integer> entry :
                map.entrySet()){
            pq.offer(entry);
        }

        while (k > 0) {
            result.add(pq.poll().getKey());
            k--;
        }
        return result;
    }
}