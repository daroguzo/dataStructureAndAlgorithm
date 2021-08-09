package algorithm.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q10845 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            switch (operation) {
                case "push":
                    int x = sc.nextInt();
                    queue.offer(x);
                    break;
                case "pop":
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if (queue.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "front":
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else

                    break;
                case "back":
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else

                    break;
            }
        }
    }

}

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>();
        int back = -1;
        for(int i = 0 ; i < N ; i ++) {
            st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            switch(type) {
                case "push":
                    back = Integer.parseInt(st.nextToken());
                    queue.offer(back);
                    break;
                case "pop":
                    if(queue.isEmpty()) {
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty()? 1: 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty()? -1: queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty()? -1: back).append("\n");
                    break;

            }
        }
        System.out.print(sb);
    }
}
