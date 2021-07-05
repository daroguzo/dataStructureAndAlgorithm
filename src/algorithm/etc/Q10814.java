package algorithm.etc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[][] signIn = new String[count][2];

        for (int i = 0; i < count; i++) {
            signIn[i][0] = sc.next();
            signIn[i][1] = sc.next();
        }

        Arrays.sort(signIn, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
            }
        });

        for (int i = 0; i < count; i++) {
            System.out.println(signIn[i][0] + " " + signIn[i][1]);
        }
    }
}
