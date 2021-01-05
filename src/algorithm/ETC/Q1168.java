package algorithm.ETC;

import java.util.Scanner;
import java.util.Vector;

public class Q1168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        Vector<Integer> vector = new Vector<Integer>();

        for (int i = 1; i <= input; i++) {
            vector.add(i);
        }
        int now = count - 1;

        while (true){
            sb.append(vector.get(now));
            vector.remove(now);
            if(vector.size()==0)
                break;
            sb.append(", ");
            now += count - 1;
            now %= vector.size();
        }
        sb.append(">");
        System.out.println(sb);
    }
}

