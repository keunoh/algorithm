package step2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Back2581 {
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
        // Q. 자연수 M, N 주어짐
        // M이상 N이하의 자연수 중 소수인 것을 고르고 최소값과 소수들의 합을 구하라
        // 입력 첫째 줄에 M, 둘째 줄에 N

        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= N ; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 1)
                list.add(i);
            count = 0;
        }

        int sum = 0;
        List<Integer> list2 = new ArrayList<>();
        for (int num : list) {
            if (num >= M) {
                sum += num;
                list2.add(num);
            }
        }

        if (list2.size() >= 1) {
            System.out.println(sum);
            System.out.println(list2.get(0));
        } else {
            System.out.println(-1);
        }
    }

    // 조금 더 효율적으로 풀기 위해 다른 사람 소스 코드를 작성해보자

}
