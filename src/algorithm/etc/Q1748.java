package algorithm.etc;

import java.util.Scanner;

/*
문제
1부터 N까지의 수를 이어서 쓰면 다음과 같이 새로운 하나의 수를 얻을 수 있다.

1234567891011121314151617181920212223...
이렇게 만들어진 새로운 수는 몇 자리 수일까? 이 수의 자릿수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 100,000,000)이 주어진다.

출력
첫째 줄에 새로운 수의 자릿수를 출력한다.
 */
public class Q1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        long ans = 0;
        for (int start = 1, len = 1; start <= input ; start*=10, len++) {
            int end = start * 10 - 1;
            if (end > input) {
                end = input;
            }
            ans += (long) (end - start + 1) * len;
        }
        System.out.println(ans);
    }
}
