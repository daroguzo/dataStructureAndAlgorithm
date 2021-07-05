package algorithm.etc;
import java.util.Scanner;

public class Q1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int result = Integer.parseInt(input, 8);
        System.out.println(Integer.toBinaryString(result));
    }
}
