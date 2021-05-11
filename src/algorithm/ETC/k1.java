package algorithm.ETC;

import java.util.HashMap;
import java.util.Map;

public class k1 {
    public int solution(String s) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zer");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "thr");
        map.put(4, "fou");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "sev");
        map.put(8, "eig");
        map.put(9, "nin");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                sb.append(s.charAt(i));
            }
            else {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    if (i+3 < s.length()) {
                        if (s.substring(i, i + 3).equals(entry.getValue())) {
                            sb.append(entry.getKey());
                        }
                    }

                }

            }

        }
        answer = Integer.parseInt(sb.toString());
            return answer;
    }

    public static void main(String[] args) {
        System.out.println(new k1().solution("23four5six7"));
    }
}
