import java.util.Scanner;

public class Back10809 {
    public static void main(String[] args) {
        /**
         * 1. 문제를 읽고 이해한다.
         * 2. 문제를 익숙한 용어로 재정의한다.
         * 3. 어떻게 해결할지 계획을 세운다.
         * 4. 계획을 검증한다.
         * 5. 프로그램으로 구현한다.
         * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */
        //소문자로만 이루어진 단어 S, 알파벳으로 찾을 때 해당 알파벳 처음 등장하는 위치반환
        //없으면 -1
        //각 알파벳을 다 검증하는 듯
        //영어 알파벳은 총 26개
        final String ALPHA_BET = "abcdefghijklmnopqrstuvwxyz";

        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        //기준을 출력으로 잡아야 하나 입력으로 잡아야 하나
        //출력으로 잡자 알파벳 기준
        //1. 순차적으로 해당 알파벳을 검사
        //2. 주어진 단어에 포함되어 있다면 해당 인덱스를 반환
        //3. 없다면 -1 반환
        for (int i = 0; i < ALPHA_BET.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (ALPHA_BET.charAt(i) == S.charAt(j)) {
                    System.out.print(j + " ");
                    break;
                }
                if (j == S.length() - 1 && ALPHA_BET.charAt(i) != S.charAt(j)){
                    System.out.print("-1 ");
                }
            }
        }
    }
}
