package step2;

import java.util.Scanner;

public class Back2444 {
    /**
     * 1. 문제를 읽고 이해한다.
     * 2. 문제를 익숙한 용어로 재정의한다.
     * 3. 어떻게 해결하지 계획을 세운다.
     * 4. 계획을 검증한다.
     * 5. 프로그램으로 구현한다.
     * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
     * @param args
     */
    public static void main(String[] args) {
        //Q. 첫째 줄부터 2 * N - 1 번째 줄까지 차례대로 별 출력
        //1, 3, 5, 7, 9, 7, 5, 3, 1

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //하나씩 해보기
        //맨위 사각형부터
        //맨위 삼각형
        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j >= 0; j--) {
                if (i >= j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 0; j < N - 1; j++) {
                if (i > j)
                    System.out.print("*");
            }
            System.out.println();
        }
        //그다음 아래 사각형
        //그다음 아래 삼각형
        for (int i = 0; i < N - 1; i++) {
            System.out.print(" ");
            for (int j = 0; j < N - 1 ; j++) {
                if (i <= j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int j = N - 2; j >= 0 ; j--) {
                if (i < j)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
