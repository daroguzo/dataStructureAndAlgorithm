package dataStructure;

import java.util.Scanner;

// 역순 정렬
public class ReverseArray {
    // 두 값을 바꾸는 함수 swap()
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a){
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length-i-1);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();  // 요솟수

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("역순 정렬 완료");
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] = " + x[i]);

        }
    }
}
