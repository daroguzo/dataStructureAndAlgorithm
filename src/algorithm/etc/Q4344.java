package algorithm.etc;

import java.util.Scanner;

public class Q4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            float sum = 0;
            String[] numbers = s.split(" ");
            float students = Integer.parseInt(numbers[0]);
            for (int i = 1; i <= students; i++) {
                sum += Integer.parseInt(numbers[i]);
            }
            float average = sum / students;
            float count = 0;
            for (int i = 1; i <= students; i++) {
                if (Integer.parseInt(numbers[i]) > average)
                    count++;
            }
            System.out.printf("%.3f%%\n", count / students * 100);
        }
    }
}
