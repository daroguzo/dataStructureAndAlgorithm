package algorithm.dfs;

import java.util.Scanner;

public class Permutation {
    static int n, m;
    static int[] arr, pm;
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        pm = new int[m];
        check = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Permutation m = new Permutation();
        m.dfs(0);
    }

    private void dfs(int l) {
        if (l==m) {
            for (int i :
                    pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (!check[i]) {
                    check[i] = true;
                    pm[l] = arr[i];
                    dfs(l+1);
                    check[i] = false;
                }
            }
        }
    }
}
