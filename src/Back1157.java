import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Back1157 {
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
        //Q. 알파벳 대소문자 단어 주어지면, 가장 많이 사용된 알파벳 무엇인지 알아내기
        //대소문자 구분없이 사용된거
        //가장많이 사용된 알파벳이 여러개 존재하면 ? 출력

        //IgnoreCase로 구분해야할 것 같음
        //알파벳기본적으로 배열이 필요할거같고 카운트를 증가시키면 될듯
        //마지막엔 가장 높은 카운트를 가진 인덱스 리턴
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] countArray = new int[26];
        Scanner scanner = new Scanner(System.in);
        String vocabulary = scanner.nextLine();

        //소문자 a 아스키 : 97
        //대문자 A 아스키 : 65
        for (int i = 0; i < vocabulary.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (vocabulary.charAt(i) == alphabet.charAt(j) || vocabulary.charAt(i) + 32 == alphabet.charAt(j))
                    countArray[j]++;
            }
        }

        int max = countArray[0];
        List<Integer> maxIndexList = new ArrayList<>();
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > max)
                max = countArray[i];
        }
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] == max)
                maxIndexList.add(i);
        }
        if (maxIndexList.size() > 1) {
            System.out.println("?");
        } else {
            System.out.println((char)(alphabet.charAt(maxIndexList.get(0)) - 32));
        }
    }
}
