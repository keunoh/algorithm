package recursive;

public class Back23564 {
    public static void main(String[] args) {
        /*
        1. 문제를 읽고 이해한다.
        2. 문제를 익숙한 용어로 재정의한다.
        3. 어떻게 해결할지 계획을 세운다.
        4. 계획을 검증한다.
        5. 프로그램으로 구현한다.
        6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */

        //길이가 n인 문자열 S = abc; s1 = a, s2 = b, s3 = c
        //길이가 n인 양의 정수 수열 A = {1, 2, 1}
        // a1 = 1, a2 = 2, a3 = 1

        //----------//
        // si 는 ai번 => X1은 s1 1번
        // X0 은 ai번 + 1 => 2번
        // X1 = X0s1X0 => a

        // si 는 ai번 => X2는 s2 즉 2번
        // X1 은 ai번 => s2 + 1 즉 3번
        // X2 = X1s2X1s2X1
        // X2 = X0s1X0 s2 X0s1X0 s2 X0s1X0 => ababa

        // si 는 ai번 => X3은 s3 즉 1번
        // X2 은 ai번 => s3 + 1 즉, 2번
        // X3 = X2s3X2
        // X3 = X1s2X1s2X1s3X1s2X1s2X1
        // X3 = X0s1X0s2X0s1X0s2X0s1X0s3X0s1X0s2X0s1X0s2X0s1X0

        //기저사례를 만들자
        //i가 1이면 X0s1X0을 리턴

        //구현체
        //조건1. si 는 ai번이다.
        //조건2. xi-1은 ai + 1번이다.
        //우선 문자열을 만들어 보자.

        //번갈아가면서 더해야함 Xi-1는 : 1 + 1번
        //Si는 : 1번 [A[1]]
//        String X1 = X0 + S.charAt(1) + X0;
    }
}
