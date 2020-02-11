package algorithm.IO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, input;
        input = sc.nextInt();
        List<Integer> list = new ArrayList();

        for (int i = 0; i < input; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            list.add(a + b);
        }
        for (Integer j:
             list) {
            System.out.println(j);
        }
    }
}
