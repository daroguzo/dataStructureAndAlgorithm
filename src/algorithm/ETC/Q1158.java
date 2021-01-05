package algorithm.ETC;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= input; i++) {
            queue.add(i);
        }

        for (int i = 0; i < input - 1; i++) {
            for (int j = 0; j < count - 1; j++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll() + ", ");
        }
        sb.append(queue.poll() + ">");
        System.out.println(sb);
    }
}
