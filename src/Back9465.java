public class Back9465 {

    static int[][] dp;
    static int[][] arr;
    public static void main(String[] args) {
        int N = 4; // 입력값
        dp = new int[5][N + 1];
        arr = new int[][]{{0, 0, 0, 0, 0, 0},{0, 50, 10, 100, 20, 40}, {0, 30, 50, 70, 10, 60}};

        // N이 3보다 작은 경구
//        System.out.println(arr[1][1] >= arr[2][1] ? arr[1][1] : arr[2][1]);
//        System.out.println(arr[1][1] + arr[2][2] >= arr[2][1] + arr[1][2] ? arr[1][1] + arr[2][2] : arr[2][1] + arr[1][2]);


        dp[1][3] = arr[1][1] + arr[2][2] + arr[1][3];
        dp[2][3] = arr[1][1] + arr[2][3];
        dp[3][3] = arr[2][1] + arr[1][2] + arr[2][3];
        dp[4][3] = arr[2][1] + arr[1][3];
        // END

        // N >= 4일 경우 만족하는 점화식
//        int i = 1;
        int n = 4;

        // 4번 반복
        // n이 N이 될때 까지 반복
        while (true) {
            for (int i = 1; i <= 4; i++) {
                if (i % 2 == 1) {
                    if (n % 2 == 0)
                        dp[i][n] = dp[i][n - 1] + arr[2][n];
                    else
                        dp[i][n] = dp[i][n - 1] + arr[1][n];
                }
                else {
                    if (n % 2 == 0)
                        dp[i][n] = dp[i][n - 1] + arr[1][n];
                    else
                        dp[i][n] = dp[i][n - 1] + arr[2][n];
                }
            }
            if (N == n) break;
            n++;
        }

        int max = 0;
        for (int j = 1; j <= 4; j++) {
            System.out.println(j + "번째 : " + dp[j][N]);
            if (dp[j][N] >= max) max = dp[j][N];
        }
//
        System.out.println("max = " + max);
    }
}
