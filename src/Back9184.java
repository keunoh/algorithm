import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back9184 {
    /**
     * 1. 문제를 읽고 이해한다.
     * 2. 문제를 익숙한 용어로 재정의한다.
     * 3. 어떻게 해결할지 계획을 세운다.
     * 4. 계획을 검증한다.
     * 5. 프로그램으로 구현한다.
     * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
     */
    /**
     * 재귀함수
     * 1. 조각 중 하나를 뗴내어 자신이 해결하고, 나머지 조각들은 자기 자신을 호출해 해결한다.
     * 2. 모든 재귀 함수는 이와 같이 '더 이상 쪼개지지 않는' 최소한의 작업에 도달했을 때
     * 답을 곧장 반환하는 조건문을 포함해야함.
     * 이떄 쪼개지지 않는 가장 작은 작업들을 가리켜 재귀 호출의 기저 사례(base case)라고 한다.
     */

    /**
     * 함수 w에서 a,b,c 중 20이 넘어가게 되면 w(20,20,20)을 호출하고,
     * 0 이하일 경우는 1을 반환하기 때문에
     * 각 배열의 크기가 21 (0~20)을 넘기지 않는다.
     */
    static int[][][] dp = new int[21][21][21];
    public static void main(String[] args) throws IOException {
        // Q. 세 개의 정수가 주어진다.
        // a, b, c가 주어졌을 때, w(a, b, c)를 출력하시오
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == -1 && b == -1 && c == -1) break;

            sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a, b, c)).append('\n');
        }
        System.out.println(sb);
    }

    //아래 함수를 최대한 최적화 하는 것이 목표인 듯
    //1. 세개의 수가 같은 경우 처리 => 2의 n승이 결과값
    //2. a > b > c 이면 2반환
    //메모이제이션? (Memoization)

    /**
     * 메모이제이션과 동적계획법
     */
    static int w(int a, int b, int c) {
        // a,b,c가 범위를 벗어나지 않으면서 메모이제이션이 되어있는 경우
        if (inRange(a,b,c) && dp[a][b][c] != 0)
            return dp[a][b][c];

        if (a <= 0 || b <= 0 || c <= 0)
            return 1;

        if (a > 20 || b > 20 || c > 20)
            return dp[20][20][20] = w(20,20,20);

        if (a < b && b < c)
            return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);

        return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }

    /**
     * 배열을 참조하려 할 때 a,b,c 중 하나라도 범위 밖의 수가
     * 나올 수 있기 때문에 이를 체크해주기 위한 함수
     */
    static boolean inRange(int a, int b, int c) {
        return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
    }

    /**
     * 동적계획법의 특징은 대체로 재귀 + Memoization이라는 것을 생각
     * 동적 계획법으로 풀어나가야 한다는 점이 가장 큰 문제
     * 즉, 처음 방문하는 재귀라면 계산을 통해 얻은 값을 메모리에 저장,
     * 이후 재방문을 할 경우 다시 계산하는 것이 아닌 저장 된 값을 사용하라는 것
     * 이 문제에서는 a,b,c라는 변수가 작용하는 만큼 3차원 배열을 이용하여 풀이하면 되겠다.
     * 대략적으로 dp 배열에 저장해두는 것과, 이미 저장된 경우만 추가해주면 대부분 완성
     * 메소드를 하나 더 추가했다.
     * 문제 조건을 잘 읽어보면 세 변수중 하나라도 0이하일 경우는 1,20을 초과한 경우에 w(20,20,20) 호출
     * 결과적으로 각 차원에 대해 21개 (0~20)의 공간만 생성해준 뒤 메모이제이션 해주면 된다.
     * 대신에 한 가지 조건이 붙는다면, 처음 w를 호출할때에는 음수 또는 20이 넘는 수가 입력
     * 될수도 있기 때문에 배열을 참조하고자 할 때 IndexOutOfBoundException 발생할 수 있다.
     * 이를 체크하기 위해 inRange()가 추가됨
     */
}
