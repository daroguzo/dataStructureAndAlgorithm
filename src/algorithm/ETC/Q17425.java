package algorithm.ETC;

import java.io.*;

/*
문제
두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다. 예를 들어, 2의 약수는 1, 2가 있고, 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24가 있다. 자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고, f(A)로 표현한다. x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다.

자연수 N이 주어졌을 때, g(N)을 구해보자.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 100,000)가 주어진다. 둘째 줄부터 테스트 케이스가 한 줄에 하나씩 주어지며 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

출력
각각의 테스트 케이스마다, 한 줄에 하나씩 g(N)를 출력한다.
 */
public class Q17425 {
    static final int MAX = 1000000;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] d = new long[MAX + 1];
        for (int i = 1; i <= MAX; i++) {
            d[i] = 1;
        }
        for (int i = 2; i <= MAX; i++) {
            for (int j = 1; i * j <= MAX; j++) {
                d[i * j] += i;
            }
        }
        long[] s = new long[MAX + 1];
        for (int i = 1; i <= MAX; i++) {
            s[i] = s[i-1] + d[i];
        }
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(s[n] + "\n");
        }
        bw.flush();
    }
}
