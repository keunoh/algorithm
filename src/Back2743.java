import java.util.Scanner;

public class Back2743 {
    public static void main(String[] args) {
        /**
         * 1. 문제를 읽고 이해한다.
         * 2. 문제를 익숙한 용어로 재정의한다.
         * 3. 어떻게 해결할지 계획을 세운다.
         * 4. 계획을 검증한다.
         * 5. 프로그램으로 구현한다.
         * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */
        //알파벳으로만, 그 길이 출력
        //알파벳 입력 받고, 어따가? 스트링에 담으면 되잖아
        Scanner scanner = new Scanner(System.in);
        String vocabulary = scanner.nextLine();
        System.out.println(vocabulary.length());
    }
}
