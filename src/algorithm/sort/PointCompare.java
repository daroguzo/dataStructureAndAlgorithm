package algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PointCompare {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y;
            } else {
                return this.x - o.x;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }
        Collections.sort(list);
        for (Point p :
                list) {
            System.out.print(p.x + " " + p.y);
            System.out.println();
        }
    }

}
