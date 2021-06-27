package algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String must = sc.nextLine();
        String subjects = sc.nextLine();
        System.out.println(new Curriculum().solution(must, subjects));
    }

    private String solution(String must, String subjects) {
        Queue<Character> queue = new LinkedList<>();

        for (char c :
                must.toCharArray()) {
            queue.offer( c);
        }

        for (char c :
                subjects.toCharArray()) {
            if (queue.contains(c)) {
                if (queue.poll() != c)
                    return "NO";
            }
        }

        if (!queue.isEmpty()) {
            return "NO";
        }

        return "YES";
    }
}
