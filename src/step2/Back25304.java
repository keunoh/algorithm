package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back25304 {
    public static void main(String[] args) throws IOException {
        // 구매한 각 물건의 가격과 개수
        // 구매한 물건들의 총 금액
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int price = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());

            sum += price * quantity;
        }

        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
