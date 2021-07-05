package algorithm.etc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q11651 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] point = new int[count][2];

        for (int i = 0; i < count; i++) {
            point[i][0] = sc.nextInt();
            point[i][1] = sc.nextInt();
        }
        Arrays.sort(point, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1])
                    return Integer.compare(o1[0], o2[0]);
                else
                    return Integer.compare(o1[1], o2[1]);
            }
        });
        for (int i = 0; i < count; i++) {
            System.out.println(point[i][0] + " " + point[i][1]);
        }

    }
}
