package algorithm.IO;


import java.util.Scanner;

public class Q10953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            String[] arr = scanner.next().split(",");
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
    }
}
