package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10813 {
    public static void main(String[] args) throws IOException {

        // 바구니 N개 순서대로 1, .., N 까지 번호 매겨져있다.
        // 각각 공이 1개씩 들어있음
        // M번 공을 바꾸고 싶음, 공을 바꿀 바구니 2개 선택하고 공을 서로 교환한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        StringTokenizer st2;
        int tmp;
        //섞어주자
        for (int i = 0; i < M; i++) {
            st2 = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st2.nextToken());
            int B = Integer.parseInt(st2.nextToken());

            tmp = arr[A - 1];
            arr[A - 1] = arr[B - 1];
            arr[B - 1] = tmp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
