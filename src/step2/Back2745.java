package step2;

import java.util.Scanner;

public class Back2745 {
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
        // Q. B진법 수 N이 주어짐
        // 10진법 넘어가는 진법은 A : 10, B:11 ... Z:35로 이용할 것

        // 첫쨰 줄에 B진법 수 N이 주어짐 이걸 10진법으로 출력
        // 우선 2진법을 10진법으로 나타내려면?
        //2(2) + 2(0) = 4 + 1

        // 반대로 10진법을 2진법으로 나타낸다면?
        // 5/2  2 ... 1
        // 2/2  1 ... 0
        // 몫이 1이면 멈춘다.
        // 11/3  3 ... 2
        //  3/3  1 ... 0
        //3의 제곱 + 0 + 2

        // 34 / 3  11 ... 1
        // 11 / 3  3 ... 2
        // 3  / 3  1 ... 0
        // 3(3) + 0 +  + 1
        // 27 + 0 + (3 * 2) + 1
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int B = scanner.nextInt();
        int decimal = 0;

        for (int i = 0; i < N.length(); i++) {
            int value = (int) Math.pow(B, N.length() - i - 1);
            int value2 = 0;

            if (N.charAt(i) >= 65 && N.charAt(i) <= 90) {
                value2 = N.charAt(i) - 55;
            } else {
                value2 =  Integer.parseInt(String.valueOf(N.charAt(i)));
            }
            decimal += value * value2;
        }
        System.out.println(decimal);

    }
}
