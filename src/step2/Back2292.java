package step2;

import java.util.Scanner;

public class Back2292 {
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
        // Q. 방1부터 시작해서 N번방까지 최소 개수의 방을 지나가는지 구하시오
        // 1 6 12 18
        // 1 7 20 38
        // 1그룹  2그룹       3그룹           4그룹
        // 1    (1 + 6) (1 + 6 + 12) (1 + 6 + 12 + 18)
        // x그룹
        // 2그룹이라면
        // 1 + 6 * (2-1)
        // 3그룹이라면
        // 1 + 6 * (3-2) + 6 * (3-1)
        // 1    2 ~ 7      8 ~ 19         20 ~ 37
        // 6의 배수로 누적
        // N이 몇 번째 그룹에 속해있는지 알면 될 듯 하다.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        int sum = 1;
        while (true) {
            if (N == 1)
                break;
            sum += 6 * count;
            count++;
            if (N <= sum)
                break;
        }
        System.out.println(count);
    }
}
