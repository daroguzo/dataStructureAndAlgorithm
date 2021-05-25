package algorithm.string;

import java.util.Scanner;

public class ReverseWords2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new ReverseWords2().solution(s));
    }

    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while(lt < rt){
            if(!Character.isAlphabetic(s[lt]))
                lt++;
            else if(!Character.isAlphabetic(s[rt]))
                rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);
        return answer;
    }
}
