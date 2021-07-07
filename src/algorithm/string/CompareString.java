package algorithm.string;

import java.util.Arrays;
import java.util.Comparator;

public class CompareString {
    public static void main(String[] args) {
        String[] strings = {"abcd", "abce", "cdx"};
        int n = 2;
        for (String s :
                new CompareString().solution(strings, n)) {
            System.out.print(s + " ");
        }
    }

    private String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);

                if (c1 == c2)
                    return o1.compareTo(o2);
                else
                    return c1 - c2;
            }
        });
        return strings;
    }
}
