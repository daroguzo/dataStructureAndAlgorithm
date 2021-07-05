package algorithm.etc;

import java.util.Scanner;

/*
문제
정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1
정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.

출력
각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
 */
public class Q9095 {
    static int go (int count, int sum, int goal) {
        if (sum > goal)
            return 0;
        if (sum == goal)
            return 1;
        int now = 0;
        for (int i = 1; i <= 3; i++) {
            now += go(count + 1, sum + i, goal);
        }
        return now;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int goal = sc.nextInt();
            System.out.println(go(0, 0, goal));
        }
    }
}
