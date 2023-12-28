package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2566 {
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
        // Q. 9X9 격자판 81개의 자연수 또는 0이 주어짐
        // 이들 중 최대값찾고 최대값이 몇 행 몇 열에 위치한 수인지 구하라
        // 0 <= N < 100

        // 첫째 줄에 최대값 출력, 둘째 줄에 최대값 위치한 행렬번호 공백사이에 두고 출력
        // 최대값이 두 개 이상이면 한 곳 위치 출력

        //우선 작은 행렬로 테스트 해보기
        //max 값을 계속 갱신시키면서 현재 max값의 i j 를 저장해두자
        //이제 고쳐서 9개의 입력값을 받도록 하고 공백으로 구분해서 각 행렬마다 값을 초기화
        int[][] arr = new int[9][9];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = arr[0][0];
        int dimensionIndex[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    dimensionIndex[0] = i + 1;
                    dimensionIndex[1] = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(dimensionIndex[0] + " " + dimensionIndex[1]);

    }
}
