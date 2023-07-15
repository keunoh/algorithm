package recursive;

import java.util.Scanner;

public class Back10870 {
    public static void main(String[] args) {
        //0. 피보나치 수는 0과 1로 시작한다.
        //1. Fn = Fn-1 + Fn-2 (n>=2)
        //2. n이 주어졌을때 Fn의 값을 구하기

        //1. 우선 입력값을 받은 n에 대하여 피보나치 수열을 모두 담고 있는 배열을 생성해야겠다.
        //2. 그 다음 배열의 마지막 인덱스 값을 반환
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //재귀 함수로 고치기
        //1. 우선 고정 값들을 밖으로 뽑아내보자
        if (n == 0) {
            System.out.println(0);;
        } else {
            int N = n + 1;
            int[] arr = new int[N];
            arr[0] = 0;
            arr[1] = 1;

            solve(N, arr, 2);
        }
    }

    static void solve(int N, int[] arr, int count) {
        //2. 기저사례(base case) 설정하기
        if (N == count) {
            System.out.println(arr[N - 1]);
            return;
        }
        //3. 재귀호출 구현하기
        //하나의 조각 해결하기
        arr[count] = arr[count - 1] + arr[count - 2];

        solve(N, arr, count + 1);
    }
}
