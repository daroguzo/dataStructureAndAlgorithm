package dataStructure;

import java.util.Scanner;

public class DayOfYear {
    static int[][] mdays = {
            {31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},    // 평년
            {31,29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},    // 윤
    };

    // 윤년 계산하기
    static int isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // y년m월d일의 경과일수 구하기
    static int dayOfYear(int y, int m, int d){
        int days = d;

        for (int i = 1; i < m; i++) {
            days += mdays[isLeap(y)][i-1];
        }
        return days;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수 구하기");

        do{
            System.out.print("년: "); int year = stdIn.nextInt();
            System.out.print("월: "); int month = stdIn.nextInt();
            System.out.print("일: "); int day = stdIn.nextInt();

            System.out.printf("그 해 %d일째 입니다.\n", dayOfYear(year, month, day));

            System.out.print("한번 더? (1. yes, 2.no): ");
            retry = stdIn.nextInt();
        }while (retry == 1);
    }
}
