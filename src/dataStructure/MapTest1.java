package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        String s = "inflearninlove";
        System.out.println(new MapTest1().solve(s));
    }

    private int solve(String s) {
        if (s == null || s.length() == 0)
            return -1;

        Map<Character, Integer> map = new HashMap<>();

        for (char ch :
                s.toCharArray()) {

//            if (!map.containsKey(ch)) {
//                map.put(ch, 1);
//            } else {
//                map.put(ch, map.get(ch) + 1);
//            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
