package dataStructure;

public class Array_max {
    public static void main(String[] args) {
        int[] input = {8, 2, 6, 5, 1, 7, 5};
        System.out.println(new Array_max().solve(input));
    }

    private int solve(int[] input) {
        if (input.length == 0) return 0;

        int max = 0;
        int sofaMin = input[0];

        for (int j : input) {
            if (j < sofaMin) {
                sofaMin = j;
            } else {
                max = Math.max(max, j - sofaMin);
            }
        }
        return max;
    }
}
