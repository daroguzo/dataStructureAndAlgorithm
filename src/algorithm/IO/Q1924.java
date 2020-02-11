package algorithm.IO;

import java.util.Scanner;

public class Q1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        String day[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int date[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31 ,30, 31};
        String result;
        if(1 <= a && a <= 12){
            if(1 <= b && b <= date[a-1]){
                for (int i = 1; i <= a-1; i++) {
                    if( a == 1)
                        break;
                    sum += date[i-1];
                }
                sum += b;
                result = day[sum % 7];
                System.out.println(result);
            }
        }
    }
}
