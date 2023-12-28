package step2;

import java.util.Scanner;

public class Back2903 {
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
        // Q. 중앙 이동 알고리즘
        // 정사각형 이루는 점 4개를 고른다.
        // 1. 정사각형의 각 변의 중앙에 점을 하나 추가
        // 2. 정사각형의 중심에 점을 하나 추가
        // 초기상태 점 4개, 1번 - 점 9개, 2번 - 점 25개

        // N번 거친 후의 점의 개수는?
        // 사각형 1개(4) = 4
        // 사각형 4개(16) = 9 -> 4 + 5
        // 사각형 16개(64) = 25 -> 9 + 16
        // 사각형 64개 = 81 -> 25 + 56
        // 사각형 264개 = 1089 -> a + ?
        //2의2승 , 3의2승, 5의2승 9의2승

        //몰라서 참고했음
        //각 변의 점의 개수의 제곱을 하면 점의 개수가 나온다
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int point = 2;
        for (int i = 0; i < N; i++) {
            point = (point - 1) + point;
        }
        System.out.println(point * point);
    }
}
