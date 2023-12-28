package step2;

import java.util.Scanner;

public class Back11005 {
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
        // Q. 10진수가 주어짐, 이를 B진법으로 바꿔 출력
        // ex) 10을 2진수로
        // 10 / 2   5...0
        // 5  / 2   2...1
        // 2  / 2   1...0
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int base = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        convert(N, base, sb);
        sb.reverse();
        System.out.println(sb.toString());
    }
    static String convert(int N, int base, StringBuilder sb) {
        if (N / base == 0 || N / base == 1) {
            if (N % base >= 10 && N % base <= 36) {
                char ch = (char) (N % base + 55);
                sb.append(ch);
            } else {
                sb.append(N % base);
            }
            if (N / base == 1)
                sb.append(1);
            return null;
        }
        if (N % base >= 10 && N % base <= 36) {
            char ch = (char) (N % base + 55);
            sb.append(ch);
        } else {
            sb.append(N % base);
        }
        return convert(N / base, base, sb);
    }
}
