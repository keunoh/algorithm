import java.util.Scanner;

public class Back9461 {

    static long[] dp = new long[101];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();

            for (int i = 6; i <= N; i++) {
                if (dp[i] == 0)
                    dp[i] = dp[i - 1] + dp[i - 5];
            }
            System.out.println(dp[N]);
            T--;
        }

    }


}
