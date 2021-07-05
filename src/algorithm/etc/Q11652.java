package algorithm.etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q11652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        long[] card = new long[input];
        int count = 1 , max_count = 0;
        long result= 0;

        for (int i = 0; i < input; i++) {
            card[i] = sc.nextLong();
        }
        if(input == 1) {
            System.out.println(card[0]);
            return;
        }
        Arrays.sort(card);
        for(int i = 0; i < input - 1; i++) {

            if(i == input - 2) {
                if(card[i] == card[i + 1]) 
                    count++;
                if(max_count < count) { 
                    max_count = count; 
                    result = card[i]; 
                    count = 1;
                }else if(max_count == count) {
                    result = Math.min(result, card[i]);
                }
            }
            else if(card[i] == card[i+1]) {
                count++;
            }
            else {
                if(max_count<count) {
                    max_count = count;
                    result = card[i];
                    count =1;

                }else if(max_count == count) {
                    result = Math.min(result, card[i]);
                    max_count = count;
                    count=1;
                }else {
                    count =1;
                }
            }
        }
        System.out.println(result);
    }
}
