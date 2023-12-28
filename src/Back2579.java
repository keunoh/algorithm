import java.util.Map;
import java.util.Scanner;

public class Back2579 {
    /**
     * 1. 계단은 한 번에 한 계단씩 or 두 계단씩 오를 수 있음
     * 2. 연속된 세 개의 계단은 밟아서는 안 됨. 시작점 제외
     * 3. 마지막 도착계단은 반드시 밟아야함.
     * @param args
     */

    static Integer dp[];
    static int arr[];

    public static void main(String[] args) {
        // 가능한 최대값 구하기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        dp = new Integer[N + 1];
        arr = new int[N + 1];

        for (int i = 1; i <= N ; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        dp[1] = arr[1];

        if (N >= 2)
            dp[2] = arr[1] + arr[2];

        System.out.println(find(N));
    }

    static int find(int N) {
        if(dp[N] == null)
            dp[N] = Math.max(find(N - 2), find(N - 3) + arr[N - 1] + arr[N]);

        return dp[N];
    }
}
