package algorithm.dfs;

import java.util.Scanner;

public class Riding {
    static int n, truck = 0;
    static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        truck = sc.nextInt();
        n = sc.nextInt();
        int[] dogs = new int[n];
        for (int i = 0; i < n; i++) {
            dogs[i] = sc.nextInt();
        }
        Riding m = new Riding();
        m.dfs(0, 0, dogs);
        System.out.println(answer);

    }

    public void dfs(int l, int sum, int[] dogs) {
        if (sum > truck)
            return;
        if (l == n) {
            answer = Math.max(sum, answer);
        } else {
            dfs(l+1, sum + dogs[l], dogs);
            dfs(l+1, sum, dogs);
        }
    }
}
