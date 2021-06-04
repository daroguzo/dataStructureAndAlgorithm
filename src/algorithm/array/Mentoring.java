package algorithm.array;

import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] students = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                students[i][j] = sc.nextInt();
            }
        }

        System.out.println(new Mentoring().solution(m, n, students));
    }

    private int solution(int m, int n, int[][] students) {
        int answer = 0;

        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++){
                int cnt = 0;
                for(int k = 0; k < m; k++){
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++){
                        if(students[k][s] == i)
                            pi = s;
                        if(students[k][s] == j)
                            pj = s;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt == m){
                    answer++;
//                    System.out.println(i+" "+j);
                }
            }
        }
        return answer;
    }
}
