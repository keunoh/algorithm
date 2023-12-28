package step2;

import java.util.Scanner;

public class Back5622 {
    public static void main(String[] args) {
        /**
         * 1. 문제를 읽고 이해한다.
         * 2. 문제를 익숙한 용어로 재정의한다.
         * 3. 어떻게 해결할지 계획을 세운다.
         * 4. 계획을 검증한다.
         * 5. 프로그램으로 구현한다.
         * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */
        //번호를 금속까지 동그라미 한 칸당 1초 소요됨
        //1번 누르는데 2초 소요, 3번 누르는데 4초 소요 등등.. 1초씩 증가
        //전화번호를 각 숫자에 해당하는 문자로 외웠음
        //문자 몇개(3~4)가 하나의 번호에 속해있음

        //1은 2초, 2는 3초, 3은 4초 ... 9는 10초

        //단어 주어짐 2 <= S <= 15
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        //각 알파벳이 어떤 번호에 속해있는지 파악해야함.
        //ASCII로 'A'는 65 : 65, 66, 67은 2번 그룹
        // 68, 69, 70은 3번 그룹
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    sum += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    sum += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    sum += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    sum += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    sum += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    sum += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    sum += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    sum += 10;
                    break;
                default:
                    sum += 0;
            }
        }
        System.out.println(sum);
    }
}