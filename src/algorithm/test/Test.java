package algorithm.test;

import java.util.*;

public class Test {
    public int[] solution(String code, String day, String[] data) {
        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        String strCode, strDay, price, time;

        for (String str :
                data) {
            String[] splice = str.split(" ");
            price = splice[0].substring(6);
            strCode = splice[1].substring(5);
            strDay = splice[2].substring(5, 13);
            time = splice[2].substring(13);

            if (code.equals(strCode) && day.equals(strDay)) {
                map.put(Integer.parseInt(time), Integer.parseInt(price));
            }
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        for (int key : keyList) {
            System.out.println(String.format("Key : %s, Value : %s", key, map.get(key)));
            arr.add(map.get(key));
            System.out.println(map.get(key));
        }

        int[] answer = new int[arr.size()];
        int size = 0;
        for(int item : arr) {
            answer[size++] = item;
        }
        return answer;
    }
    
    public static void main(String[] args) {
    }
}
