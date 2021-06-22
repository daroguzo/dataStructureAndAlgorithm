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
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();

        for (char key :
                a.toCharArray()) {
            aMap.put(key, aMap.getOrDefault(key, 0)+1);
        }

        for (char key :
                b.toCharArray()) {
            bMap.put(key, bMap.getOrDefault(key, 0)+1);
        }

        for (char key :
                a.toCharArray()) {
            if (!aMap.get(key).equals(bMap.get(key)))
                return "NO";
        }

        return "YES";
    }
}
