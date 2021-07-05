package algorithm.hash;


import java.util.HashMap;

public class Marathon {
    public static void main(String[] args) {
        String[] participant = {"a", "a", "b", "c"};
        String[] completion = {"a", "b", "c"};

        System.out.println(new Marathon().soltution2(participant, completion));
    }
    public String soltution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashP = new HashMap<>();
        HashMap<String, Integer> hashC = new HashMap<>();

        for (String c :
                completion) {
            hashC.put(c, hashC.getOrDefault(c, 0) + 1);
        }

        for (String p :
               participant ) {
            hashP.put(p, hashP.getOrDefault(p, 0) + 1);
        }

        for (String p :
                participant) {
            if (!hashC.containsKey(p))
                answer = p;

            if (!hashP.get(p).equals(hashC.get(p)))
                answer = p;
        }

        return answer;
    }

    public String soltution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String p :
             participant) {
            hashMap.put(p, hashMap.getOrDefault(p, 0) + 1);
        }
        for (String c :
                completion) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) - 1);
        }

        for (String key :
                hashMap.keySet()) {
            if (hashMap.get(key) != 0)
                answer = key;
        }
        System.out.println(hashMap);
        return  answer;
    }

}
