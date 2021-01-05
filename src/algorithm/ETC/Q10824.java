package algorithm.ETC;

import java.util.Scanner;

public class Q10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = new String[4];
        for (int i = 0; i < 4; i++)
            inputs[i] = sc.next();
        String n1 = inputs[0] + inputs[1];
        String n2 = inputs[2] + inputs[3];
        long result = Long.valueOf(n1) + Long.valueOf(n2);
        System.out.println(result);
    }
}
