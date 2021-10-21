package algorithm.dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaDelivery {
    static class Point{
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> pz, hs;
    public void DFS(int l, int s) {
        if (l == m) {
            for (int x :
                    combi) {
                int sum = 0;
                for (Point h :
                        hs) {
                    int dis = Integer.MAX_VALUE;
                    for (int i :
                            combi) {
                        dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                    }
                    sum += dis;
                }
                answer = Math.min(answer, sum);
            }
        } else  {
            for (int i = s; i < len; i++) {
                combi[l] = i;
                DFS(l + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        PizzaDelivery T = new PizzaDelivery();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = kb.nextInt();
                if (tmp == 1) hs.add(new Point(i, j));
                else if (tmp == 2) pz.add(new Point(i, j));
            }
        }
        len = pz.size();
        combi = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
