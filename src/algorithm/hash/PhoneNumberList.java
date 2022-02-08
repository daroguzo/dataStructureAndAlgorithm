package algorithm.hash;

import java.util.Arrays;
import java.util.HashMap;

public class PhoneNumberList {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123","456","789"};
        String[] phone_book3 = {"12","123","1235","567","88"};
        System.out.println(new PhoneNumberList().solution2(phone_book3));
    }
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s :
                phone_book) {
            hashMap.put(s, 0);
        }

        for (String s :
                phone_book) {
            for (int i = 0; i < s.length(); i++) {
                String tmp = s.substring(0, i);
                if (hashMap.containsKey(tmp)) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }

    public boolean solution2(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;
        }

        return true;
    }
}
