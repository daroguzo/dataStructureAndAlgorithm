package algorithm.etc;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt() - 45;
        boolean flag = false;
        if (minute < 0) {
            flag = true;
            minute += 60;
        }
        if (flag)
            hour--;
        if (hour < 0)
            hour = 23;

        System.out.println(hour + " " + minute);
    }
}
