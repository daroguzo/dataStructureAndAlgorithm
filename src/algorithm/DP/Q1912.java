package algorithm.DP;

import java.util.Scanner;

public class Q1912 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[100001];
        int[] a = new int[100001];

        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
            d[i]=a[i];
        }

        for(int i=1; i<n ; i++){
            final int i1 = d[i - 1] + a[i];
            if(i1 >=d[i]){
                d[i]= i1;
            }
        }

        int max=d[0];
        for(int i=1; i<n ; i++){
            if(d[i]>max)
                max=d[i];
        }
        System.out.println( max );
    }
}