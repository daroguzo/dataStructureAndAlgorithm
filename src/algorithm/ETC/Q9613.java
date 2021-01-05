package algorithm.ETC;

import java.util.Scanner;

public class Q9613 {
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else {
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            int count = sc.nextInt();
            int[] arr = new int[count];
            for (int j = 0; j < count; j++) {
                arr[j] = sc.nextInt();
            }

            long sum = 0;
            for (int j = 0; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    sum += gcd(arr[j], arr[k]);
                }
            }
            System.out.println(sum);
        }
    }
}
