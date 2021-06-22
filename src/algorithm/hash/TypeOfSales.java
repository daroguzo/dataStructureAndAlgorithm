package algorithm.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TypeOfSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sales = new int[n];
        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }
        new TypeOfSales().solution(n, k, sales);
    }

    private void solution(int n, int k, int[] sales) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int lt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k-1; i++) {
            hashMap.put(sales[i], hashMap.getOrDefault(sales[i], 0) + 1);
        }

        for (int rt = k-1; rt < n; rt++) {
            hashMap.put(sales[rt], hashMap.getOrDefault(sales[rt], 0) + 1);
            list.add(hashMap.size());
            hashMap.put(sales[lt], hashMap.get(sales[lt]) - 1);
            if (hashMap.get(sales[lt]) == 0) {
                hashMap.remove(sales[lt]);
            }
            lt++;
        }

        for (int i :
                list) {
            System.out.print(i + " ");
        }
    }
}
