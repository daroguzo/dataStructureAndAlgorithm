package dataStructure;

public class Sort1 {
    public static void main(String[] args) {
        int E[] = {4, 2, 7, 1};
        int i = 0, Temp;
        do {
            int j = i + 1;
            do {
                if (E[i] > E[j]) {
                    Temp = E[i];
                    E[i] = E[j];
                    E[j] = Temp;
                }
                j++;

            } while (j < 4);
            i++;
        } while (i < 3);
        for (int a = 0; a < 4; a++) {
            System.out.print(E[a] + "\t");
        }
        System.out.println();
    }
}


