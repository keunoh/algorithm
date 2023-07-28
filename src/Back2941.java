import java.util.Scanner;

public class Back2941 {
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
        //Q. 크로아티아 알파벳 중 특정 두 알파벳은 하나의 알파벳으로 쓰임
        //ex) dz -> 하나의 알파벳, lj , nj도... 그 외에는 알파벳 그대로 한 글자씩
        //총 몇개의 크로아티아 알파벳으로 이루어져있는지 출력

        //문자열 입력 받고 하나씩 검증하면서 연속된 알파벳이 크로아티알파벳을
        //만족하면 하나의 카운트로 처리하면 될 듯
        Scanner scanner = new Scanner(System.in);
        String vocabulary = scanner.nextLine();
        int count = 0;

        //마지막 알파벳에 대해서 길이만 고려해주면 해결될 듯
        //해당 케이스에 걸리면 i + 1과 i + 2가 보장이 되어야함.
        for (int i = 0; i < vocabulary.length(); i++) {
            //마지막 문자를 검사 한다면 카운트를 올려주고 break 한다.
            if (i == vocabulary.length() - 1) {
                count++;
                break;
            }

            switch (vocabulary.charAt(i)) {
                case 'c':
                    if (vocabulary.charAt(i + 1) == '=' || vocabulary.charAt(i + 1) == '-')
                        i++;
                    break;
                case 'd':
                    if (vocabulary.charAt(i + 1) == '-') {
                        i++;
                        break;
                    }
                    if (i + 2 > vocabulary.length() - 1) break;
                    if (vocabulary.charAt(i + 1) == 'z' && vocabulary.charAt(i + 2) == '=')
                        i += 2;
                    break;
                case 'l':
                    if (vocabulary.charAt(i + 1) == 'j')
                        i++;
                    break;
                case 'n':
                    if (vocabulary.charAt(i + 1) == 'j')
                        i++;
                    break;
                case 's':
                    if (vocabulary.charAt(i + 1) == '=')
                        i++;
                    break;
                case 'z':
                    if (vocabulary.charAt(i + 1) == '=')
                        i++;
                    break;
            }
            count++;
        }
        System.out.println(count);
    }

    //스트링빌더를 이용해서 해도 괜찮을 듯 함.
}
