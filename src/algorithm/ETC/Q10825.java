package algorithm.ETC;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q10825 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[][] student = new String[count][4];

        for (int i = 0; i < count; i++) {
            student[i][0] = sc.next();
            student[i][1] = sc.next();
            student[i][2] = sc.next();
            student[i][3] = sc.next();
        }

        Arrays.sort(student, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) {
                    if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
                        if (Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) {
                            // 국영수 점수가 같다면 사전 오름차순
                            return o1[0].compareTo(o2[0]);
                        }
                        // 국어점수 같고 영어점수 같을 때, 수학 점수는 내림차순
                        return Integer.compare(Integer.parseInt(o2[3]), Integer.parseInt(o1[3]));
                    }
                    // 국어 점수 같을 때, 영어 점수는 오름차순
                    return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
                }
                // 국어점수는 내림차순
                return Integer.compare(Integer.parseInt(o2[1]), Integer.parseInt(o1[1]));
            }
        });

        for (int i = 0; i < count; i++) {
            System.out.println(student[i][0]);
        }
    }
}
