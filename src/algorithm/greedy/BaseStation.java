package algorithm.greedy;

import java.util.HashSet;

public class BaseStation {

    // 틀린 접근
    public int solution2(int n, int[] stations, int w) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int s :
                stations) {
            for (int i = s; i <= s + w; i++) {
                if (i <= n)
                    hashSet.add(i);
            }
            for (int i = s; i >= s - w; i--) {
                if (i >= 1)
                    hashSet.add(i);
            }
        }
        while (hashSet.size() != n) {
            for (int i = w + 1; i <= n; i++) {
                if (!hashSet.contains(i)) {
                    for (int j = i; j <= i + w; j++) {
                        if (j <= n)
                            hashSet.add(j);
                    }
                    for (int j = i; j >= i - w; j--) {
                        if (j >= 1)
                            hashSet.add(j);
                    }
                    answer++;
                    System.out.println(hashSet);
                    System.out.println(i);
                } else {
                    i += w - 1;
                }
            }
        }
        return answer;
    }
}
