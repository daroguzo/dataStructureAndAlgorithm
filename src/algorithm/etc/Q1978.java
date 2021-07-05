package algorithm.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  Q1978 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int primeCnt = 0;

        while(count-- != 0) {
            boolean isPrime = true;
            int chkIn = Integer.parseInt(input[count]);
            for(int i = 2; i < chkIn; i++) {

                if(chkIn % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && chkIn > 1)
                primeCnt++;
        }
        System.out.println(primeCnt);
    }
}
