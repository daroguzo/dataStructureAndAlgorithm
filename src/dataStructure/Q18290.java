package dataStructure;

import java.util.Scanner;

/*
문제
크기가 N×M인 격자판의 각 칸에 정수가 하나씩 들어있다. 이 격자판에서 칸 K개를 선택할 것이고, 선택한 칸에 들어있는 수를 모두 더한 값의 최댓값을 구하려고 한다. 단, 선택한 두 칸이 인접하면 안된다. r행 c열에 있는 칸을 (r, c)라고 했을 때, (r-1, c), (r+1, c), (r, c-1), (r, c+1)에 있는 칸이 인접한 칸이다.

입력
첫째 줄에 N, M, K가 주어진다. 둘째 줄부터 N개의 줄에 격자판에 들어있는 수가 주어진다.

출력
선택한 칸에 들어있는 수를 모두 더한 값의 최댓값을 출력한다.

제한
1 ≤ N, M ≤ 10
1 ≤ K ≤ min(4, N×M)
격자판에 들어있는 수는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
항상 K개의 칸을 선택할 수 있는 경우만 입력으로 주어진다.
 */
public class Q18290 {
    static int[][] a = new int[10][10];
    static boolean[][] c = new boolean[10][10];
    static int n, m, k;
    static int ans = -2147483647;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static void go(int px, int py,int cnt, int sum) {
        if (cnt == k) {
            if (ans < sum) ans = sum;
            return;
        }
        for (int x=px; x<n; x++) {
            for (int y=0; y<m; y++) {
                if (c[x][y]) continue;
                boolean ok = true;
                for (int i=0; i<4; i++) {
                    int nx = x+dx[i];
                    int ny = y+dy[i];
                    if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                        if (c[nx][ny]) ok = false;
                    }
                }
                if (ok) {
                    c[x][y] = true;
                    go(x, y, cnt+1, sum+a[x][y]);
                    c[x][y] = false;
                } }
        } }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = sc.nextInt();
            } }
        go(0,0, 0, 0);
        System.out.println(ans);
    }
}
