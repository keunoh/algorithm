package step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Back5597 {
    public static void main(String[] args) {
        /**
         * 1. 문제를 읽고 이해한다.
         * 2. 문제를 익숙한 용어로 재정의한다.
         * 3. 어떻게 해결할지 계획을 세운다.
         * 4. 계획을 검증한다.
         * 5. 프로그램으로 구현한다.
         * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */
        //Q. 교실에 학생 30명, 각 학생별로 1~30번까지 출석번호 존재
        //   과제 28명이 제출, 제출 안한 2명의 출석 번호 구하기

        // 1. 1~30까지 배열을 만들자
        // 2. 정수 입력 받아서 배열을 또 만들고
        // 3. 원본 배열과 비교해서 없는 숫자 도출하자.

        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            arrList.add(i + 1);
        }

        Scanner scanner = new Scanner(System.in);
        List<Integer> arrList2 = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            int testValue = scanner.nextInt();
            arrList2.add(testValue);
        }

        arrList.removeAll(arrList2);

        for (int value: arrList ) {
            System.out.println(value);
        }
    }
}
