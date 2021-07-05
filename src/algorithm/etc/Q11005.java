package algorithm.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Character> list = new ArrayList<>();

        while (a > 0) {
            if (a % b < 10)
                list.add((char) (a % b + '0'));
            else
                list.add((char) (a % b - 10 + 'A'));
            a /= b;
        }

        for (int i = list.size() - 1; i >= 0; i--)
            System.out.print(list.get(i));
    }
}
