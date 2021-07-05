package algorithm.etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q10820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[4];

        while (sc.hasNextLine()){
            char[] inputs = sc.nextLine().toCharArray();
            int[] num = new int[inputs.length];
            Arrays.fill(count, 0);

            for(int i = 0; i < inputs.length; i++) {
                num[i] = (int)inputs[i];
                if(num[i]>='a' && num[i]<='z') {
                    count[0]++;
                }else if(num[i]>='A' && num[i]<='Z') {
                    count[1]++;
                }else if(num[i]>='0' && num[i]<='9') {
                    count[2]++;
                }else if(num[i]== ' ') {
                    count[3]++;
                }
            }
            System.out.println(count[0] +" "+ count[1] +" "+ count[2] +" "+ count[3]);
        }
    }
}
