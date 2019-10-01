package dataStructure;

import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int[] a ){
        int max = a[0];
        for (int i = 1; i < a.length; i++){
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("최댓값 구하기");
        System.out.print("개수 : ");
        int num = stdIn.nextInt();

        int[] number = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("number[" + i + "] : ");
            number[i] = stdIn.nextInt();
        }

        System.out.println("최댓값은 " + maxOf(number) + "입니다.");
    }
}
