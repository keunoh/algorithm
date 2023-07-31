import java.util.Scanner;

public class Back11653 {
    /**
     * 1. 문제를 읽고 이해한다.
     * 2. 문제를 익숙한 용어로 재정의한다.
     * 3. 어떻게 해결할지 계획을 세운다.
     * 4. 계획을 검증한다.
     * 5. 프로그램으로 구현한다.
     * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
     * @param args
     */
    public static void main(String[] args) {
        // Q. 정수 N이 주어졌을 때, 소인수분해하는 프로그램
        // 정수 1 <= N <= 10,000,000
        // 결과를 한 줄에 하나씩 오름차순으로 출력
        // N = 1인 경우 아무것도 출력하지 않음

        // 소인수 구하기
        // 자기의 절반까지만 반복
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if (n != 1)
            System.out.println(n);

    }
    // 정답은 구했지만 코드가 비효율적이다.
    // 소수 : 1과 자기자신으로만 나누어지는 수
    // 소인수분해 : 어떤 수를 소수인 인수로 분해하는 것

    // 에라토스테네스의 체의 원리를 이해하자.
}
