package step2;

import java.util.Scanner;

public class Back2748 {
    public static void main(String[] args) {
        // 피보나치 수는 0과 1로 시작
        // 0번째 피보나치는 0, 1번째 피보나치는 1
        // Fn = Fn-1 + Fn-2 (n>=2)

        /**
         * n값을 받고 n번째 피보나치 수 구하기
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /**
         * n이 1일 경우 처리
         */
        if (n == 1) {
            System.out.println(1);
            return;
        }

        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i -2];
        }
        System.out.println(arr[n]);
    }
}
