package algorithm.hash;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(new FindAllAnagram().solution(s, t));
    }

    private int solution(String s, String t) {
        int answer = 0;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int lt = 0;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tMap.put(tArr[i], tMap.getOrDefault(tArr[i], 0) + 1);
        }

        for (int i = 0; i < t.length() - 1; i++) {
            sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0) + 1);
        }

        for (int rt = t.length()-1; rt < s.length(); rt++) {
            sMap.put(sArr[rt], sMap.getOrDefault(sArr[rt], 0) + 1);
            if (sMap.equals(tMap)) {
                answer++;
            }
            sMap.put(sArr[lt], sMap.get(sArr[lt]) - 1);
            if (sMap.get(sArr[lt]) == 0) {
                sMap.remove(sArr[lt]);
            }
            lt++;
        }

        return answer;
    }
}
