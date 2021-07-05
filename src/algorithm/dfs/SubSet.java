package algorithm.dfs;

public class SubSet {
    static int n;
    static int[] ch;
    public static void main(String[] args) {
        SubSet subSet = new SubSet();
        n = 3;
        ch = new int[n + 1];
        subSet.dfs(1);
    }

    private void dfs(int i) {
        if (i == n + 1) {
            StringBuilder tmp = new StringBuilder();
            for (int j = 1; j <= n; j++) {
                if (ch[j] == 1)
                    tmp.append(j).append(" ");
            }
            if (tmp.length() > 0)
                System.out.println(tmp);
        }
        else {
            ch[i] = 1;
            dfs(i + 1);
            ch[i] = 0;
            dfs(i + 1);
        }
    }


}
