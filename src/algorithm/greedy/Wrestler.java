package algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
    int height;
    int weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o) {
        if (this.height == o.height)
            return this.weight - o.weight;
        else
            return o.height - this.height;
    }
}

public class Wrestler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1, max;
        ArrayList<Body> bodies = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            bodies.add(new Body(height, weight));
        }
        Collections.sort(bodies);
        max = bodies.get(0).weight;
        for (int i = 1; i < n; i++) {
            if (max < bodies.get(i).weight) {
                answer++;
                max = bodies.get(i).weight;
            }
        }
        System.out.println(answer);
    }
}
