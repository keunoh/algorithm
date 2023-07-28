import java.util.Scanner;

public class Back10798 {
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
        //Q. 글자붙이기. 글자는 영어 대문자 A-Z, a-z, 0-9
        // 행렬로 단어를 5개 만든다. 행이 5개 열은 랜덤(최대15개)
        // 만들어진 단어들을 세로로 읽으면서 오른쪽으로 한칸씩 이동
        // 그 단어들을 연속으로 붙여서 한 줄로 출력

        //스트링배열로만드는게 좀 더 편할 듯 하다.
        //하지만 스트링을 입력받아서 한 글자씩 더하려면 결국 char로 변하기 마련아닐까?
        String[][] twoDimensionArray = new String[5][15];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < twoDimensionArray.length; i++) {
            String vocabulary = scanner.nextLine();
            for (int j = 0; j < vocabulary.length(); j++) {
                twoDimensionArray[i][j] = String.valueOf(vocabulary.charAt(j));
            }
        }
        //[0,0], [1,0], [2,0]
        for (int i = 0; i < twoDimensionArray[0].length; i++) {
            for (int j = 0; j < twoDimensionArray.length; j++) {
                if (twoDimensionArray[j][i] != null)
                    System.out.print(twoDimensionArray[j][i]);
            }
        }
    }
}
