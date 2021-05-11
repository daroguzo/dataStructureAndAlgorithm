package algorithm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public int[] solution(int[] t, int[] r) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < t.length) {
            if (t[i] == r[i]) {
                list.add(r[i]);
                i++;
            }
            i++;
        }

        int[] answer = new int[list.size()];
        int size = 0;
        for(int item : list) {
            answer[size++] = item;
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] t = {0,1,3,0};
        int[] r = {0,1,2,3};
        System.out.println(new Test1().solution(t, r));
    }
}
