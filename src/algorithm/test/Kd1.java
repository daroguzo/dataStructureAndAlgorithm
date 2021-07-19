package algorithm.test;

public class Kd1 {
    public static void main(String[] args) {
        int[] d = {2,2,4,3};
        int m = 6;
        System.out.println(new Kd1().solution(d, m));
    }

    private int solution(int[] d, int m) {
        int box = 1;
        int boat = 0;
        for (int j : d) {
            if (j < box) {
                box = 1;
                boat++;
            } else {
                m -= box;
                boat++;
                box *= 2;
            }
            if (m <= 0)
                return boat;
        }
        if (m > 0)
            return -1;
        else
            return boat;
    }


}
