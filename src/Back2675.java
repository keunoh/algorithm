import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2675 {
    public static void main(String[] args) throws IOException {
        /**
         * 1. 문제를 읽고 이해한다.
         * 2. 문제를 익숙한 용어로 재정의한다.
         * 3. 어떻게 해결할지 계획을 세운다.
         * 4. 계획을 검증한다.
         * 5. 프로그램으로 구현한다.
         * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */
        //Q. 문자열 S 받음, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력
        //첫째 문자 R번, 둘쨰 문자 R번 반복
        //첫째 줄 테스트 케이스 T
        //둘째 줄 반복횟수, 문자열

        //테스트 케이스 받고, 공백으로 받은다음 각 문자 횟수별로 String 으로 더해줘서 출력하면 될듯
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        String[] arr = new String[T];
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(S.charAt(j) + "");
                }
            }
            arr[i] = sb.toString();
        }

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
