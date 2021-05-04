package dataStructure;

import java.util.ArrayList;
import java.util.List;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class SortTest2 {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 3}, {2, 6}, {8, 10}, {15, 18}
//        };
        Interval in1 = new Interval(1, 3);
        Interval in2 = new Interval(2, 6);
        Interval in3 = new Interval(8, 10);
        Interval in4 = new Interval(15, 18);

        List<Interval> intervals = new ArrayList<>();
        intervals.add(in1);
        intervals.add(in2);
        intervals.add(in3);
        intervals.add(in4);
        SortTest2 a = new SortTest2();
        List<Interval> list = a.merge(intervals);
        a.print(list);
    }

    private void print(List<Interval> list) {
        for (Interval in : list) {
            System.out.println(in.start + " " + in.end);
        }
    }

    private List<Interval> merge(List<Interval> intervals) {
        if (intervals.isEmpty()) {
            return intervals;
        }

        // sorting
        intervals.sort((a, b) -> a.start - b.start);

        List<Interval> result = new ArrayList<>();
        Interval before = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (before.end >= current.start) {
                before.end = Math.max(current.end, before.end);
            } else {
                result.add(before);
                before = current;
            }
        }
        if (!result.contains(before)) {
            result.add(before);
        }

        return result;
    }

    private List<Interval> solve(List<Interval> intervals) {

        return null;
    }

}
