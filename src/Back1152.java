import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Back1152 {
    public static void main(String[] args) throws IOException {
        /**
         * 1. 문제를 읽고 이해한다.
         * 2. 문제를 익숙한 용어로 재정의한다.
         * 3. 어떻게 해결할지 계획을 세운다.
         * 4. 계획을 검증한다.
         * 5. 프로그램으로 구현한다.
         * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */
        //Q. 영어 대소문자 공백으로 이루어진 문자열
        //몇개에 단어가 있느뇨?
        //중복단어도 세어라

        //공백을 기준으로 단어를 세는 건가 봄
        //단어는 공백 하나로 구분됨, 공백이 연속해서 나오는 경우없음
        //문자열을 공백으로 시작하거나 끝날 수 있음

        //문자열 받고 Trim으로 각 끝 공백 제거해주면 될듯
        //그리고 나서 공백 구분으로 길이 파악
        //토크나이저로 해봄
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int length = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            length++;
        }
        System.out.println(length);
    }
}
