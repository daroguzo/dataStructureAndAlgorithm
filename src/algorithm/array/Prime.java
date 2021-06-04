package algorithm.array;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Prime T = new Prime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }

    private int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i]==0){
                answer++;
                for (int j = i; j <=n ; j+=i) {
                    ch[j]=1;
                }
            }
        }
        for (int i :
                ch) {
            System.out.print(i + " ");
        }
        return answer;
    }
}
