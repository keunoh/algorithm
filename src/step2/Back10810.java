package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10810 {
    public static void main(String[] args) throws IOException {
        /**
         * 1. 문제를 읽고 이해한다.
         * 2. 문제를 익숙한 용어로 재정의한다.
         * 3. 어떻게 해결할지 계획을 세운다.
         * 4. 계획을 검증한다.
         * 5. 프로그램으로 구현한다.
         * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */
        //바구니 총 N개, 각 바구니 번호 1번 부터 N번까지 매겨져있음
        //공도 1번 부터 N까지 횟수제한없이 가지고 있다.
        //가장 처음 바구니에는 공이 들어있지 않음 => 배열 초기화시 기본값 0
        //M번(횟수) 공을 넣으려함
        //한 번 공을 넣을 때 바구니 범위 정하고, 정한 바구니에 모두 같은 번호 넣음
        //바구니에 공이 있다면 빼고 새로 공을 넣음
        //공을 넣을 바구니는 연속되어야함?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int firstValue = Integer.parseInt(st.nextToken()) - 1;
            int secondValue = Integer.parseInt(st.nextToken()) - 1;
            int thirdValue = Integer.parseInt(st.nextToken());

            for (int j = firstValue; j <= secondValue; j++) {
                arr[j] = thirdValue;
            }
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
