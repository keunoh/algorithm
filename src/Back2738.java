import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2738 {
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
        //Q. N*M크기의 두 행렬 A와 B가 주어짐
        //이때 두 행렬들 더해야함
        //행렬 : 수 또는 변수 등의 일련의 개체드를 행과 열에 맞추어 직사각형
        //모양으로 순서있게 배열하여 괄호[]로 묶은 것
        // N : 행의 개수, M : 열의 개수

        // A와 B의 행렬을 주어진 N * M으로 두 개 만들자.
        // 그리고 각 행렬에 대응하는 원소를 더해서 하나의 행렬을 출력하자.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());  //행
        int M = Integer.parseInt(st.nextToken());  //열

        int[][] twoDimensionA = new int[N][M];
        int[][] twoDimensionB = new int[N][M];
        int[][] result = new int[N][M];

        //숫자만큼 입력을 먼저 받고 delimiter 공백으로 해서 각각 숫자에 담아주자.
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                twoDimensionA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                twoDimensionB[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i][j] = twoDimensionA[i][j] + twoDimensionB[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    //중복코드가 많은데 어떻게 줄일 수 없을까..
}
