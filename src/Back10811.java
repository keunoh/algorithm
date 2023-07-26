import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10811 {
    public static void main(String[] args) throws IOException {
        /**
         * 1. 문제를 읽고 이해한다.
         * 2. 문제를 익숙한 용어로 재정의한다.
         * 3. 어떻게 해결할지 계획을 세운다.
         * 4. 계획을 검증한다.
         * 5. 프로그램으로 구현한다.
         * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */
        //Q. 바구니 총 N개 가지고 있음, 각각 순서대로 1번부터 N번까지 번호
        //   앞으로 M번 바구니의 순서를 역순으로 하고 싶음
        //   순서를 바꾼뒤 가장 왼쪽부터 번호 출력
        //Condition. 1 <= N, M <= 100
        //   첫째 줄에 바구니 N개, 역순 횟수 M개 입력
        //   둘째 줄부터 i j, i번째 바구니부터 j번째 까지 바구니를 역순으로 만든다.

        // 바구니 갯수만큼 배열을 생성해준다.
        // 첫 번째 인덱스가 0이아닌 1번 바구니 임을 주의하자.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        //배열의 순서를 바꾸려면?
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int iValue = Integer.parseInt(st.nextToken()) - 1;
            int jValue = Integer.parseInt(st.nextToken()) - 1;

            int reverseCount = (jValue - iValue + 1) / 2;

            for (int j = 0; j < reverseCount; j++) {
                int tmp = arr[iValue];
                arr[iValue] = arr[jValue];
                arr[jValue] = tmp;

                iValue += 1;
                jValue -= 1;
            }
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }

    }
}
