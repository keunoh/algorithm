import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back14501 {
    /**
     * 1. 문제를 읽고 이해한다.
     * 2. 문제를 익숙한 용어로 재정의한다.
     * 3. 어떻게 해결할지 계획을 세운다.
     * 4. 계획을 검증한다.
     * 5. 프로그램으로 구현한다.
     * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
     * @param args
     */
    static int N;
    static int[][] schedule;
    static int result;

    public static void main(String[] args) throws IOException {
        // Q. 오늘부터 N + 1일째 되는날 퇴사, 남은 N일 동안 '최대한' 많은 상담
        // 비서는 하루에 하나씩 서로 다른 사람의 상담을 잡아놓았음
        // Ti : 각 상담을 완료하는데 걸리는 기간
        // Pi : 상담했을 때 받을 수 있는 금액

        // 상담을 하는데 필요한 기간은 1일보다 클 수 있음
        // ex) 1일에 상담하게 되면 2,3일에 있는 상담 할 수 없음 (상담 기간이 3일이기때문)
        //     2일에 상담하게 되면 3,4,5,6일에 잡혀있는 상담 할 수 없음
        //     N+1일째에는 회사에 없기 때문에 6,7일에 있는 상담 할 수 없음 (상담기간이 1일보다 김)
        // 퇴사 전에 할 수 있는 상담의 최대 이익은 1,4,5일에 있는 상담 하는 것
        // 10 + 20 + 15 = 45

        // G. 상담을 적절히 했을 때 백준이가 얻을 수 있는 최대 수익을 구하는 프로그램

        // 2차원 배열로 입력 받음 데이터를 저장해 놓자.
        // 순서대로 진행해서 판단..
        // 최대 금액을 어떻게 판단할 수 있지?
        // 조건 1. 스케줄은 1 ~ 15일
        // 조건 2. 상담소요기간은 1 ~ 5일
        // 조건 3. 상담금액은 1 ~ 1000원

        // 인간의 생각으로 풀어보자 먼저
        // 1. 1일 상담을 한다면 3일 소요, 10원, 그러면 2일자와 3일자는 못 하겠네
        // 2. 4일자 상담을 하자 1일 소요, 20원, 다음날 상담은 바로할 수 있겠네
        // 3. 5일자 상담을 하자 2일 소요, 15원, 7일 일자에 하루 일할 수 있겠네
        // 4. 근데 7일자 상담이 2일 이상이면 더 이상 일은 못 해
        // 5. 끝. 총 6일 일하고 45원을 벌었어.
        // 6. 다른케이스가 없는 거 같음 1일에 일을 하면

        // 1. 1일 상담 건너 뛰고 2일 상담을하자 5일소요, 20원
        // 2. 그 다음 일은 못 하네
        // 3. 끝. 총 20원
        // 4. 결국 주어진 시간표에서 가장 많이 버는 케이스는 45원이구나
        // 풀기 실패

        // 백트래킹(DFS) 풀이
        /**
         * 탈출 조건 : 날짜(idx)가 N이상이면 result 중 최대값을 구하며 끝낸다.
         * 만약 상담을 끝낸 날이 N이하라면. 즉, idx + schedule[idx][0] <= N 라면
         * dfs에 상담이 끝난 날짜와 합친 상담비를 넣는다.
         * 만약 상담을 끝낸 날이 N을 넘어간다면. 즉, 상담을 퇴사날까지 끝마칠 수 없다면
         * dfs에 상담이 끝난 날짜만 넘겨준다. -> 합친 상담비는 그대로고 넘겨준 날짜는 탈출
         * 조건에서 사용한다.
         * dfs(idx + 1, pay)를 dfs 끝에 넣어주어 이어서 상담하지 않고 날짜를 띄워서
         * 새로운 날짜를 탐색할 수 있도록 해준다. -> 마지막 날짜까지 모두 탐색 가능
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        schedule = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            schedule[i][0] = Integer.parseInt(st.nextToken());  // 상담하는데 걸리는 일
            schedule[i][1] = Integer.parseInt(st.nextToken());  // 돈
        }

        result = 0;
        // 0일 부터 시작
        dfs(0, 0);

        System.out.println(result);
    }

    static void dfs(int idx, int pay) {
        if (idx >= N) {
            result = Math.max(pay, result);
            return;
        }

        if (idx + schedule[idx][0] <= N) {
            // 상담을 끝마칠 수 있다면 -> 상담이 끝난 날짜와 상담비 넣음
            dfs(idx + schedule[idx][0], pay + schedule[idx][1]);
        } else {
            // 상담을 끝마칠 수 없다면 -> 상담이 끝난 날짜만 넘겨준다(탈출 조건)
            dfs(idx + schedule[idx][0], pay);
        }
        // 이어서 상담하지 않고 날짜를 띄워서 새로운 날짜를 입력 (0일부터 마지막 날짜까지 다 훑음)
        dfs(idx + 1, pay);
    }
}
