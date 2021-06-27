package algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Emergency {
    public static class Patient {
        int id;
        int emergency;

        public Patient(int id, int emergency) {
            this.id = id;
            this.emergency = emergency;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] patients = new int[n];
        for (int i = 0; i < n; i++) {
            patients[i] = sc.nextInt();
        }
        System.out.println(new Emergency().solution(n, m, patients));
    }

    private int solution(int n, int m, int[] patients) {
        int answer = 0;
        Queue<Patient> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Patient(i, patients[i]));
        }

        while (!queue.isEmpty()) {
            Patient tmp = queue.poll();
            for (Patient p :
                    queue) {
                if (p.emergency > tmp.emergency) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m)
                    return answer;
            }
        }
        return answer;
    }
}
