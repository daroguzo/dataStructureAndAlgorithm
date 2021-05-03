package dataStructure;

public class String_stringCharArray {
    public static void main(String[] args) {
        String s1 = "(a(b(c)d)";
        String s2 = "(((a(b(c(e(f)d))";
        String s3 = "in(f(lea)r)n)";
        String s4 = "a)b(c)d";
        String s5 = "a)b(c)d)";
        String s6 = "(()))";
        String s7 = "(()";
        String s8 = "))((";
        System.out.println("result: " + new String_stringCharArray().solve(s5));
    }

    private String solve(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int openBrace = 0;

        for (char c :
                s.toCharArray()) {
            if (c == '(') {
                openBrace++;
            } else if (c == ')') {
                if (openBrace == 0) {
                    continue;
                }
                openBrace--;
            }
            sb.append(c);
        }

        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && openBrace-- > 0) {
                continue;
            }
            result.append(sb.charAt(i));
        }

        return result.reverse().toString();
    }
}
