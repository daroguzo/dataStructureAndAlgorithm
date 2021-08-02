package algorithm.etc;

import java.util.Scanner;

public class Q2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sounds = new int[8];
        boolean aFlag = true;
        boolean dFlag = true;
        for (int i = 0; i < 8; i++) {
            sounds[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            if (sounds[i] > sounds[i + 1])
                aFlag = false;

            if (sounds[i] < sounds[i + 1])
                dFlag = false;
        }
        if (!aFlag && !dFlag)
            System.out.println("mixed");
        if (aFlag && !dFlag)
            System.out.println("ascending");
        else if (!aFlag && dFlag)
            System.out.println("descending");
    }
}
