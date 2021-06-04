package algorithm.array;

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(new SieveOfEratosthenes().solution(input));
    }

    private int solution(int input) {
        int answer = 0;
        boolean[] arr = new boolean[input + 1];
        for (int i = 0; i < input; i++) {
            arr[i] = true;
        }
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i * i <= input; i++) {
            if (arr[i]) {
                for (int j = i*i; j <= input; j+=i) {
                    arr[j] = false;
                }
            }
        }

        for (boolean b :
                arr) {
            if (b)
                answer++;
        }

        return answer;
    }
}
