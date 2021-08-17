package algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MeetingRoom {
    static class Meeting implements Comparable<Meeting>{
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            if (this.end == o.end)
                return this.start - o.start;
            else
                return this.end - o.end;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        ArrayList<Meeting> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Meeting(start, end));
        }
        Collections.sort(list);
        int endTime = 0;
        for (Meeting m :
                list) {
            if (m.start >= endTime) {
                answer++;
                endTime = m.end;
            }
        }
        System.out.println(answer);
    }
}
