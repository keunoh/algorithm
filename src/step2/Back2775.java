package step2;

import java.util.Scanner;

public class Back2775 {
    /**
     * 1. a층 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와야함
     * 2. 아파트는 0층부터 있음, 각 층에는 1호부터 있다
     * 3. 0층의 i호에는 i명이 산다.
     * 4. 1 <= k, n <= 14
     * @param args
     */
    public static void main(String[] args) {
        // 0층 -> 1호 1명, 2호 2명, 3호 3명, ...
        // k = 1, n = 3

        // 1층 1호 == 0층 1호 == 1
        // 1층 2호 == 0층 1호 + 0층 2호 == 1 + 2
        // 1층 3호 == 0층 1호 + 0층 2호 + 0층 3호 == 1 + 2 + 3

        // 2차원 배열로 나타낼 수 있을 것 같다.
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        do {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int[][] arr = new int[k + 1][n + 1];

            // 기본 배열 넣어주기
            for (int i = 1; i < arr[0].length; i++) {
                arr[0][i] = i;
            }

            for (int i = 1; i < arr.length; i++) {
                int sum = 0;
                for (int j = 1; j < arr[0].length; j++) {
                    sum += arr[i - 1][j];
                    arr[i][j] = sum;
                }
            }

            System.out.println(arr[k][n]);
            T--;
        } while(T > 0);
    }
}
