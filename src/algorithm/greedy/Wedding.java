package algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Wedding {
    static class Time implements Comparable<Time>{
        int time;
        char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            if (this.time == o.time)
                return this.state - o.state;
            else
                return this.time - o.time;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = Integer.MIN_VALUE, count = 0;
        ArrayList<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Time(start, 's'));
            list.add(new Time(end, 'e'));
        }
        Collections.sort(list);
        for (Time t :
                list) {
            if (t.state == 's')
                count++;
            else
                count--;
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }
}
