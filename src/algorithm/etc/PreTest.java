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

        Student[] students2 = {
                new Student(new int[]{1,2,3,4,5}),
                new Student(new int[]{2,1,2,3,2,4,2,5}),
                new Student(new int[]{3,3,1,1,2,2,4,4,5,5})
        };
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {1,3,2,4,2};

        for (int i:
             new PreTest().solution(answer1, students)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i:
                new PreTest().solution(answer1, students2)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (Student s :
                students2) {
            System.out.print(s.solveCount + " ");
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

    public int[] solution(int[] answers, Student[] students) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        int max = Integer.MIN_VALUE;

        for (Student s : students) {
            s.solve(answers);
            if (max < s.solveCount)
                max = s.solveCount;
        }

        for (int i = 0; i < students.length; i++) {
            if (max == students[i].solveCount)
                list.add(i + 1);
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    static class Student {
        int[] studentAnswers;
        int answerLength;
        int solveCount = 0;

        public Student(int[] studentAnswers) {
            this.studentAnswers = studentAnswers;
            this.answerLength = studentAnswers.length;
        }

        public void solve(int[] answers) {
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == studentAnswers[i % answerLength]) {
                    solveCount++;
                }
            }
        }
    }
}
