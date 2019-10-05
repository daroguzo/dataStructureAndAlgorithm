package dataStructure;

// 1000 이하의 소수를 열거(비효율)
public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;        // 나눗셈의 횟수

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if(n % i == 0)  // 나누어 떨어지는 수는 소수가 아님
                    break;      // 더이상의 반복은 불필요
            }
            if(n == i)
                System.out.println(n);
        }

        System.out.println("나눗셈을 실행한 횟수: " + counter);
    }
}
