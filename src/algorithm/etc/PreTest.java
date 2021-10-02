package algorithm.etc;

import java.util.ArrayList;
import java.util.List;

public class PreTest {
    public static void main(String[] args) {
        int[][] students = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {1,3,2,4,2};

        for (int i:
             new PreTest().solution(answer2, students)) {
            System.out.println(i + " ");
        }
    }

    public int[] solution(int[] answers, int[][] students) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        int[] correct = new int[students.length];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < students.length; i++) {
            correct[i] = solve(students[i], answers);
        }

        for (int i : correct) {
            if (max < i)
                max = i;
        }

        for (int i = 0; i < correct.length; i++) {
            if (max == correct[i])
                list.add(i + 1);
        }


        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    private int solve(int[] student, int[] answers) {
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student[i % student.length]) {
                count++;
            }
        }
        return count;
    }
}
