package algorithm.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String vote = sc.nextLine();
        System.out.println(new Vote().solution(n, vote));
    }

    private char solution(int n, String vote) {

        int max = 0;
        char maxC = ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c :
                vote.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for (char c :
                hashMap.keySet()) {
            if (max < hashMap.get(c)) {
                max = hashMap.get(c);
                maxC = c;
            }

        }
        return maxC;
    }
}
