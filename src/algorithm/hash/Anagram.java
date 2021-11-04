package algorithm.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(new Anagram().solution(a, b));
    }

    private String solution(String a, String b) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        if (a.length() != b.length()) {
            return "NO";
        }

        for (char key :
                a.toCharArray()) {
            hashMap.put(key, hashMap.getOrDefault(key, 0)+1);
        }

        for (char key :
                b.toCharArray()) {
            if (!hashMap.containsKey(key) || hashMap.get(key) == 0)
                return "NO";
            hashMap.put(key, hashMap.get(key) - 1);
        }

        return "YES";
    }
}
