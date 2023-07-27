import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Back11718 {
    /**
     * 1. 문제를 읽고 이해한다.
     * 2. 문제를 익숙한 용어로 재정의한다.
     * 3. 어떻게 해결할지 계획을 세운다.
     * 4. 계획을 검증한다.
     * 5. 프로그램으로 구현한다.
     * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //Q. 그대로 출력
        //내가 문자열을 입력완료했다는 것을 어떤 걸로 구분할 수 있을까?
        //입력은 최대 100줄, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있음
        //각 줄은 100글자 넘지 않음, 빈 줄 주어지지 않음
        //공백으로 시작하지 않음, 공백으로 끝나지 않음
        int i;
        while ((i = System.in.read()) != -1) {
            char c = (char) i;
            System.out.print(c);
        }

    }
}
