package algorithm.etc;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Q10866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            String[] line = sc.nextLine().split(" ");
            String cmd = line[0];

            if (cmd.equals("push_front")) {
                int cmd_num = Integer.parseInt(line[1]);
                deque.offerFirst(cmd_num);
            } else if (cmd.equals("push_back")) {
                int cmd_num = Integer.parseInt(line[1]);
                deque.offerLast(cmd_num);
            } else if (cmd.equals("pop_front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.pollFirst());
                } else
                    System.out.println("-1");
            } else if (cmd.equals("pop_back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.pollLast());
                } else
                    System.out.println("-1");
            } else if (cmd.equals("size")) {
                System.out.println(deque.size());
            } else if (cmd.equals("empty")) {
                if (deque.isEmpty()) {
                    System.out.println("1");
                } else
                    System.out.println("0");
            } else if (cmd.equals("front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekFirst());
                } else
                    System.out.println("-1");
            } else if (cmd.equals("back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekLast());
                } else
                    System.out.println("-1");
            }
        }
    }
}
