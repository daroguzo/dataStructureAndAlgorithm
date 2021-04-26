package algorithm.ETC;

import java.util.*;
/*
문제
규현이는 멍청하다. 왜냐하면, 1~10까지 수 밖에 모르기 때문이다. 어느 날 규현이 옆을 지나가던 태석이가 규현이를 보고 이렇게 외쳤다. "빵빵!!" 규현이는 "아하!" 하면서 세상에는 빵이란 수도 있구나 했다. 그날 이후로 규현이는 매일 친구들을 볼 때면 "빵빵!!" 거리면서 인사를 했다. 규현이의 친구 중에는 태방이가 있다. 자꾸 규현이가 "빵빵!!" 거릴때 마다 자신을 놀리는 것 처럼 생각했던 태방이는 규현이에게 그건 "빵이 아니고 영이야" 라고 가르쳐 줬다.

이제 규현이는 0~10까지 수를 알고 있다. 어느 날 자신이 알고 있는 숫자를 까먹지 않으려고 종이에 1~10까지 수를 썻다. (0은 잠시 까먹었다) 규현이의 친구 석원이는 밀덕이다. 계급을 엄청나게 좋아해서, 규현이가 써 놓은 숫자에 이등병 마크인 -를 모두 그렸다. 석원이는 규현이에게 이렇게 말했다. "너, 우리 위대하신 미하엘 칼라시니코프께서 뭐라고 했는지 알아? 단순함과 신뢰성, 그리고 저렴한 가격이 최고야!"

규현이는 그 말을 듣고서 아하 세상에는 음수도 있구나 했다.

이제 규현이가 아는 수는 -10부터 10까지 20개가 되었다. 아차, 0을 빼먹었구나, 21개가 되었다.

근처 사파리에 놀러간 규현이는 사파리 가이드 승환이와 함께 관광을 시작했다. "저기, 사자 1마리가 보이죠? 그 옆이 그 사자 부인이에요. 그러니깐, 1 더하기 1은 2죠" 규현이는 덧셈을 익혔다. "저 사자는 아까 그 사자의 자식 2마리 입니다. 그럼 총 사자는 몇 마리이지요?" 이제 규현이는 1+1을 제외한 다른 덧셈도 할 수 있다. 만세!

인도네시아에 놀러간 규현이는 자바 섬에 방문했다. 자바 섬에는 자바 커피를 재배하는 홍태석 농부가 있었다. 홍태석은 "ㅋㅋㅋ 님 음수와 양수와 0의 차이도 모름?" 하면서 음수와 양수와 0을 설명해주었다.

지금까지 배운 것을 종합해서, 한국으로 돌아오는 비행기에서 규현이는 종이에 수를 N개 썼다. (규현이가 아는 가장 큰 수는 10이기 때문에, 수를 10개까지만 쓸 수 있다.)  그 다음에, 가능한 모든 N*(N+1)/2개의 구간의 합을 구했다. 이 것을 해인이는 행렬로 표현했다.

규현이가 쓴 수를 A라고 하면, A[i]는 규현이가 i번째 쓴 수이다. 그리고, S[i][j]는 A[i]부터 A[j]까지 합이 0보다 크면 +, 0이면 0, 0보다 작으면 -이다. 여기서 i는 항상 j보다 작거나 같다. 이렇게 배열을 채우면 배열에는 총 N*(N+1)/2개의 문자가 있다. (+, -, 0 중 하나) 이 S 배열이 주어졌을 때, 규현이가 쓴 N개의 수 A를 구해서 출력하면 된다. 규현이는 -10부터 10까지의 정수밖에 모르기 때문에, A도 -10부터 10까지의 정수로만 이루어져 있어야 한다.

입력
첫째 줄에 수열의 크기 N이 주어진다. N은 10보다 작거나 같은 자연수이다. 둘째 줄에는 N(N+1)/2 길이의 문자열이 주어진다. 처음 N개의 문자는 부호 배열의 첫 번째 줄에 해당하고, 다음 N-1개의 문자는 두 번째 줄에 해당한다. 마찬가지로 마지막 문자는 N번째 줄에 해당하는 문자다.

출력
첫째 줄에 수열의 원소 N개를 빈 칸을 사이에 두고 출력한다. 답이 여러 가지 일 경우에는 아무거나 출력하면 된다.
 */
public class Q1248 {
    static int n;
    static int[][] sign;
    static int[] ans;
    static boolean check(int index) {
        int sum = 0;
        for (int i=index; i>=0; i--) {
            sum += ans[i];
            if (sign[i][index] == 0) {
                if (sum != 0) return false;
            } else if (sign[i][index] < 0) {
                if (sum >= 0) return false;
            } else if (sign[i][index] > 0) {
                if (sum <= 0) return false;
            }
        }
        return true;
    }
    static boolean go(int index) {
        if (index == n) {
            return true;
        }
        if (sign[index][index] == 0) {
            ans[index] = 0;
            return check(index) && go(index+1);
        }
        for (int i=1; i<=10; i++) {
            ans[index] = sign[index][index]*i;
            if (check(index) && go(index+1)) return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = new int[n];
        sign = new int[n][n];
        String s = sc.next();
        int cnt = 0;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                char x = s.charAt(cnt);
                if (x == '0') {
                    sign[i][j] = 0;
                } else if (x == '+') {
                    sign[i][j] = 1;
                } else {
                    sign[i][j] = -1;
                }
                cnt += 1;
            }
        }
        go(0);
        for (int i=0; i<n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
