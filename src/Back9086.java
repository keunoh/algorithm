import java.util.Scanner;

public class Back9086 {
    public static void main(String[] args) {
        /**
         * 1. 문제를 읽고 이해한다.
         * 2. 문제를 익숙한 용어로 재정의한다.
         * 3. 어떻게 해결할지 계획을 세운다.
         * 4. 계획을 검증한다.
         * 5. 프로그램으로 구현한다.
         * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */
        //Q. 문자열 입력받고 문자열의 첫 글자와 마지막 글자 출력
        //T 테이스트케이스 입력 받고
        //그 수만큼 문자열 받고
        //한번에 반환해주자.
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] arr = new String[T];

        scanner.nextLine();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }

        //char끼리 더하면 ASCII값으로 더하네..
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].charAt(0) + "" + arr[i].charAt(arr[i].length() - 1));
        }

    }
}
