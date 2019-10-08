package dataStructure;

import java.util.Scanner;

public class SeqSearch {
    static int seqSerach(int[] a, int n, int key){
        int i = 0;

        while(true){
            // 검색 성공
            if(i == n){
                return -1;
            }
            // 검색 실패
            if(a[i]== key){
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];     // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = stdIn.nextInt();
        int idx = seqSerach(x, num, ky);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "가 x[" + idx + "]에 있습니다.");
    }
}
