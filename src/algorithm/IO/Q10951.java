package algorithm.IO;

import java.util.Scanner;

public class Q10951 {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        while(stdIn.hasNextInt()){
            int input1 = stdIn.nextInt();
            int input2 = stdIn.nextInt();
            System.out.println(input1 + input2);
        }
    }
}
