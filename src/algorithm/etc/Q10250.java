package algorithm.etc;

import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int floor, room;
            if (n % h == 0) {
                floor = h;
                room = n / h;
            }
            else {
                floor = n % h;
                room = n / h + 1;
            }
            int answer = floor * 100 + room;
            System.out.println(answer);
        }
    }
}
