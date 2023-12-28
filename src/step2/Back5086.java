package step2;

import java.util.Scanner;

public class Back5086 {
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
        // 4 * 3 = 12
        // 3은 12의 약수, 12는 3의 배수
        // 4는 12의 약수, 12는 4의 배수
        // 두수 주어짐, 다음 3가지 중 어떤관계인지 구하라
        // 1. 첫 번째 숫자가 두 번째 숫자의 약수이다.
        // 2. 첫 번째 숫자가 두 번째 숫자의 배수이다.
        // 3. 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아님.

        // 입력받은 두 개의 숫자에 대해서만 고려하면 될듯
        int A, B;
        Scanner scanner = new Scanner(System.in);

        // A와 B가 0이면 break 하자
        while (true) {
            A = scanner.nextInt();
            B = scanner.nextInt();

            if (A == 0 && B == 0) break;

            if (B % A == 0) {
                System.out.println("factor");
            } else if (A % B == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }


    }
}
