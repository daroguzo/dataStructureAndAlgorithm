package algorithm.greedy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

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

    // 올바른 접근 but 시간초과
    public int solution1(int n, int[] stations, int w) {
        int answer = 0;

        Queue<Integer> sq = new LinkedList<>();
        for (int s :
                stations) {
            sq.offer(s);
        }

        int position = 1;
        while (position <= n) {
            if (!sq.isEmpty() && sq.peek() - w <= position) {
                position = sq.poll() + w + 1;
            } else {
                answer += 1;
                position += w * 2 + 1;
            }
        }

        return answer;
    }

    // 올바른 접근
    public int solution3(int n, int[] stations, int w) {
        int answer = 0, si = 0, position = 1;

        while (position <= n) {
            if (si < stations.length && stations[si] - w <= position) {
                position = stations[si] + w + 1;
                si += 1;
            } else {
                answer += 1;
                position += w * 2 + 1;
            }
        }

        return answer;
    }
}
