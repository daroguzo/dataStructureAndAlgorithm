package algorithm.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindingCalf {
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> queue = new LinkedList<>();

    public int bfs(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        queue.offer(s);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();
                for (int d :
                        dis) {
                    int nextX = x + d;
                    if (nextX == e)
                        return level + 1;
                    if (nextX >= 1 && nextX <= 100000 && ch[nextX] == 0) {
                        ch[nextX] = 1;
                        queue.offer(nextX);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        FindingCalf findingCalf = new FindingCalf();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(findingCalf.bfs(s, e));
    }
}
