package algorithm.etc;

import java.util.Scanner;

public class UpDownLeftRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1, y = 1;
        int n = sc.nextInt();
        sc.nextLine();
        String[] directions = sc.nextLine().split(" ");

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        for (String s:
             directions) {
            char d = s.charAt(0);
            int nx = -1, ny = -1;
            for (int i = 0; i < 4; i++) {
                if (d == moveTypes[i]) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                }
            }
            if (nx < 1 || ny < 1 || nx > n || ny > n)
                continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}


