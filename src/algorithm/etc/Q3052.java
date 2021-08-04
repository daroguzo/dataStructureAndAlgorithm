package algorithm.etc;

import java.util.HashMap;
import java.util.Scanner;

public class Q3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int x :
                numbers) {
            int tmp = x % 42;
            hashMap.put(tmp, hashMap.getOrDefault(tmp, 0) + 1);
        }
        System.out.println(hashMap.size());
    }
}
