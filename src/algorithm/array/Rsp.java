package algorithm.array;

import java.util.Scanner;

public class Rsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] a = new int[count];
        int[] b = new int[count];

        for (int i = 0; i < count; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            b[i] = sc.nextInt();
        }

        new Rsp().solution(count, a, b);
    }

    private void solution(int count, int[] a, int[] b) {
        for (int i = 0; i < count; i++) {
            System.out.println(battle(a[i], b[i]));
        }
    }

    private char battle(int a, int b) {
        if (a == 1) {
            if (b == 1)
                return 'D';
            else if (b == 2)
                return 'B';
            else
                return 'A';
        }
        else if (a == 2) {
            if (b == 1)
                return 'A';
            else if (b == 2)
                return 'D';
            else
                return 'B';
        } else {
            if (b == 1)
                return 'B';
            else if (b == 2)
                return 'A';
            else
                return 'D';
        }
    }
}
