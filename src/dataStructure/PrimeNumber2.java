package dataStructure;

// 1000이하의 소수를 열거(개선)
public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;                // 나눗셈의 횟수
        int ptr = 0;                    // 찾은 소수의 개수
        int[] prime = new int[500];     // 찾은 소수를 담는 배열

        prime[ptr++] = 2;               // 첫 소수는 2

        for (int n = 3; n <= 1000; n+=2) {        // 대상은 홀수만
            int i;
            for (i = 1; i < ptr; i++) {         // 이미 찾은 소수로 나누기
                counter++;
                if(n%prime[i] == 0)             // 나누어 떨어지면 소수가 아니다.
                    break;
            }
            if(ptr == i)                        // 마지막까지 나누어 떨어지지않으면 소수로 배열에 저장
                prime[ptr++] = n;
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈을 실행한 횟수: " + counter);
    }
}
