package algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public static void main(String[] args) {
//        int[] priorities = {2,1,3,2};
//        int location = 2;
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;

        Printer printer = new Printer();
        System.out.println(printer.solution(priorities, location));
    }

    public class Document {
        int priority;
        int location;

        public Document(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Document> printer = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            printer.offer(new Document(priorities[i], i));
        }

        while (!printer.isEmpty()) {
            Document poll = printer.poll();
            boolean flag = false;
            for (Document d : printer) {
                if (d.priority > poll.priority) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                printer.offer(poll);
            } else {
                answer++;
                if (poll.location == location) {
                    break;
                }
            }
        }
        return answer;
    }
}
