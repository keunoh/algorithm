import java.util.Scanner;

public class Back27866 {
    public static void main(String[] args) {
        /**
         * 1. 문제를 읽고 이해한다.
         * 2. 문제를 익숙한 용어로 재정의한다.
         * 3. 어떻게 해결할지 계획을 세운다.
         * 4. 계획을 검증한다.
         * 5. 프로그램으로 구현한다.
         * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */
        //단어 S와 정수 i가 주어짐, S의 i번째 글자 출력
        //단어먼저 받고, 개행문자 다음 정수 받고
        //그 다음에 인덱스 찾아주면 될 듯 (정수 - 1)
        Scanner scanner = new Scanner(System.in);
        String vocabulary = scanner.nextLine();
        int number = scanner.nextInt();
        System.out.println(vocabulary.charAt(number - 1));
    }
}
