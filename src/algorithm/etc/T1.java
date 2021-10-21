package algorithm.etc;

import java.util.*;

public class T1 {
    public String solution(String[] registered_list, String new_id) {
        HashSet<String> hashSet = new HashSet<>();
        Collections.addAll(hashSet, registered_list);

        if (!hashSet.contains(new_id))
            return new_id;

        while (hashSet.contains(new_id)) {
            StringBuilder idString = new StringBuilder();
            StringBuilder numberString = new StringBuilder();
            for (char c :
                    new_id.toCharArray()) {
                if (Character.isDigit(c))
                    numberString.append(c);
                else
                    idString.append(c);
            }

            if (numberString.length() == 0) {
                numberString.setLength(0);
                numberString.append(0);
            }
            int newNumber = Integer.parseInt(numberString.toString());
            newNumber += 1;
            new_id = idString.toString() + newNumber;
        }
        return new_id;
    }
}
