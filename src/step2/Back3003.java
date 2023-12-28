package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back3003 {
    /**
     * 1. 문제를 읽고 이해한다.
     * 2. 문제를 익숙한 용어로 재정의한다.
     * 3. 어떻게 해결할지 계획을 세운다.
     * 4. 계획을 검증한다.
     * 5. 프로그램으로 구현한다.
     * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //Q. 검정색 피스는 모두 있고 흰색 피스는 개수가 올바르지않음
        // 체스는 총 16개 피스 킹 1, 퀸 1, 룩 2, 비숍 2, 나이트 2, 폰 8
        // 첫째 줄에 순서대로 갯수가 주어진다.  0 <= N < 10
        // 갯수를 꼭 위의 기본 체스 공식대로 맞추어야함.
        // 넘어선다면 -해주고 부족하다면 +해줘야함

        //기준 갯수가 있어야 비교가 가능할 것 같다.
        //기준 배열 만들어 주고 각각 비교하면 되지 않을까?
        int[] originChess = {1, 1, 2, 2, 2, 8};
        int[] foundChess = new int[6];
        int[] result = new int[6];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < foundChess.length; i++) {
            foundChess[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < originChess.length; i++) {
           int x = originChess[i] - foundChess[i];
            result[i] = x;
        }

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
