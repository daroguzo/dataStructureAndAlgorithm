package algorithm.string;

import java.util.ArrayList;
import java.util.Collections;

public class StringSort {
    public static void main(String[] args) {
        String input = "Zbcdefg";
        System.out.println(new StringSort().solution(input));
    }

    private String solution(String input) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();

        for (char c :
                input.toCharArray()) {
            list.add(c);
        }
        Collections.sort(list);
        for (char c :
                list) {
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
