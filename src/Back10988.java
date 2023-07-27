import java.util.Scanner;

public class Back10988 {
    /**
     * 1. 문제를 읽고 이해한다.
     * 2. 문제를 익숙한 용어로 재정의한다.
     * 3. 어떻게 해결할지 계획을 세운다.
     * 4. 계획을 검증한다.
     * 5. 프로그램으로 구현한다.
     * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
     * @param args
     */
    public static void main(String[] args) {
        //Q. 알파벳 소문자로만 이루어진 단어
        //팰린드롬 앞으로 읽나 거꾸로 읽나 같은 걸 의미
        //팰린드롬이면 1반환 아니면 0 반환

        //문자열 받고, 거꾸로 돌린다음에 첫 번째 문자열과 같은지 판단하면 될듯
        Scanner scanner = new Scanner(System.in);
        String vocabulary = scanner.nextLine();
        //어떻게 뒤집을 것인가?
        StringBuilder sb = new StringBuilder();
        for (int i = vocabulary.length() - 1; i >= 0; i--) {
            char voca = vocabulary.charAt(i);
            sb.append(voca);
        }

        if (vocabulary.equals(sb.toString())) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
