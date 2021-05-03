package dataStructure;

public class String_substring {
    public static void main(String[] args) {
        String str[] = {"test", "teacher"};
        System.out.println(new String_substring().solve(str));
    }

    private String solve(String[] str) {
        if (str.length == 0) {
            return "";
        }

        String firstStr = str[0];

        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(firstStr) != 0) {
                firstStr = firstStr.substring(0, firstStr.length() - 1);
            }
        }
        return firstStr;
    }
}
