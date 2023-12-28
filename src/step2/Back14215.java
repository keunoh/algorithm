package step2;

import java.util.Arrays;
import java.util.Scanner;

public class Back14215 {
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
        // Q. a, b, c 세 막대 주어짐.
        // 각 막대의 길이는 양의 정수
        // 세 막대를 이용해 넓이가 양수인 삼각형
        // 삼각형의 둘레를 최대로
        // 길이를 마음대로 줄일 수 있다.

        // 만들 수 있는 삼각형의 가장 큰 둘레를 구하라
        // 직각삼각형을 구하면 되지 않을까? 피타고라스의 정리
        // a2 + b2 = c2
        // 주어진 세개의 정수 중 작은 2개를 선택해서 빗변 구한뒤 더해주자
        // 피타고라스 아닌 듯

        // 삼각형의 성질을 알아야 풀 수 있는 문제네
        // 가장 긴 변을 c라고 가정했을 때 삼각형이 만들어지기 위해서는 c >= a + b
        int[] arr = new int[3];
        Scanner scanner = new Scanner(System.in);
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        Arrays.sort(arr);

        if (arr[0] + arr[1] > arr[2])
            System.out.println(arr[0] + arr[1] + arr[2]);
        else
            System.out.println(2 * (arr[0] + arr[1]) - 1);
    }
}
