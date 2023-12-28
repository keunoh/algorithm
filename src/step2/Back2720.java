package step2;

import java.util.Scanner;

public class Back2720 {
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
        // Q. 거스름돈 액수 주어지면
        // 1. 쿼터 $0.25 개수, 2. 다임 $0.10 개수
        // 3. 니켈 $0.05 개수, 4. 페니 $0.01 개수
        // 거스름돈은 항상 $5.00 이하, 손님이 받는 동전 개수 최소

        // 첫째 줄 테스트케이스 T
        // 거스름돈 C 단위는 센트
        // 최소로 주려면 큰 단위로부터 몫을 구해서 더해나가면 될듯

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] arr = new String[T];

        for (int i = 0; i < T; i++) {
            int C = scanner.nextInt();
            int quarter = C / 25;
            int restOfCent = C % 25;
            int dime = restOfCent / 10;
            restOfCent = restOfCent % 10;
            int nickel = restOfCent / 5;
            restOfCent = restOfCent % 5;
            int penny = restOfCent;

            arr[i] = quarter + " " + dime + " " + nickel + " " + penny;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
