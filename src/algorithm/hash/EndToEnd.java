package algorithm.hash;

import java.util.HashSet;

public class EndToEnd {
    public int[] solution(int n, String[] words) {
        HashSet<String> hashSet = new HashSet<>();
        int player = 1, order = 1;
        hashSet.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            player++;
            if (player > n) {
                player = 1;
                order++;
            }
            if (hashSet.contains(words[i]) || words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                return new int[]{player, order};
            }
            hashSet.add(words[i]);
        }
        return new int[] {0, 0};
    }
}
