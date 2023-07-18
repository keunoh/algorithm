package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Back2501 {
    // 목표 : 두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하라.
    // 특이사항 : N의 약수의 개수가 K개보다 적다면 0을 반환하라.

    // 계획 : 1. 우선 자연수 N에 대하여 모든 약수를 구하자.
    // 2. 그 다음에 K번째 작은 수를 구하는 조건을 추가하자.
    // 3. 마지막으로 K개보다 적다면 0을 반환하는 조건을 추가하자.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> yaksu = findYaksu(N);
        if (yaksu.size() < K) {
            System.out.println(0);
        } else {
            System.out.println(yaksu.get(K - 1));
        }
    }

    public static List<Integer> findYaksu(int N) {
        // 자연수 N에 대한 배열을 담을 수 있도록 새롭게 생성해주자.
        List<Integer> yaksu = new ArrayList<>();

        // 약수를 담아준다.
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                yaksu.add(i);
            }
        }

        return yaksu;
    }
}
