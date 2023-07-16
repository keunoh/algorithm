package recursive;

import java.io.*;
import java.util.StringTokenizer;

public class Back25501 {
    //팰린드롬이란, 앞에서부터 읽었을 때와 뒤에서부터 읽었을 때가 같은 문자열을 말한다.
    //목적 : 반환값 + ' ' + recursion 함수 호출 횟수를 한 줄에 각각 나타내는 것이다.
    //첫 번째 입력값은 테스트케이스 횟수 T이다.
    //두 번째 라인 입력값 부터는 횟수 T만큼 문자열을 작성한다.
    public static void main(String[] args) throws IOException {
        //BufferedReader로 정리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            char[] arr = br.readLine().toCharArray();

            bw.write(isPalindrome(arr)[0] + " " + isPalindrome(arr)[1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    //목적: 결국 알아야 할 것은 recursion 검색을 언제 멈추느냐 인데
    //이것은 문자열의 길이와 관련이 있을 듯 하다. (X)
    // 2~3 자리라면 1번
    // 4~5 자리라면 2번
    //즉, char 배열을 2로나눈 몫이 recursive 한 횟수일 것이다
    //이 생각은 틀렸다. recursion 하다가 팰린드롬이 아니라면 그 과정동안의
    // count를 반환해야하기 때문이다.
    // TODO: 1. count의 위치.
    // TODO: 2. count를 더해주는 위치
    // TODO: 3. count 반환 위치

    //1. 파라미터를 하나 더 추가,
    //2. 반환을 int[]로

    static int[] recursion(char[] s, int l, int r, int count) {
        //우선 이 재귀호출을 파악해보자.
        //팰린드롬 recursion은 char배열의 인덱스 0 과 마지막 인덱스를 비교하면서
        //중앙으로 다가오는 것이다.
        //1. 기저사례(base case) : l값이 r보다 같거나 크다면 1을 반환 -> 팰린드롬을 의미
        if (l >= r) {
            return new int[] {1, count};
        }
        //2. 선행 인덱스와 후행인덱스 값이 일치하지 않으면 0을 반환 -> 팰린드롬이 아니다.
        else if (s[l] != s[r]) {
            return new int[] {0, count};
        }
        //3. 그외 경우는 문자가 일치하므로 다음 recursion 호출
        else {
            return recursion(s, l + 1, r - 1, count + 1);
        }
    }

    //주어진 문자열이 팰린드롬이면 1, 팰린드롬이 아니면 0을 반환하는 함수
    static int[] isPalindrome(char[] s) {
        return recursion(s, 0, s.length - 1, 1);
    }

}
