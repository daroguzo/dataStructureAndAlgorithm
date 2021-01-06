package dataStructure;

public class ReverseString {
    /*
    주어진 문자열을 거꾸로 뒤집은 문자열을 만드는 함수를 작성하라.

    예) hello => olleh
    예) happy new year => reay wen yppah
     */

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.solution1("hello".toCharArray()));
    }

    private char[] solution1(char[] message) {
        char[] reversedChars = new char[message.length];

        for (int i = message.length - 1; i >= 0; i--) {
            reversedChars[message.length - 1 - i] = message[i];
        }
        return reversedChars;
    }
    // 시간 복잡도: O(N)
    // 공간 복잡도: O(N)


}
