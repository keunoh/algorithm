package step2;

import java.util.Scanner;

public class Back1316 {
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
        //Q. 그룹단어 : 존재하는 모든 문자에 대해, 각 문자가 연속해서 나타나는 경우만을 말함
        // ccazzzzbb c,a,z,b가 모두 연속해서 나타남
        // kin k,i,n 이 연속해서 나타암
        // aabbbccb는 b가 떨어져서 나타나기 때문 그룹단어 아님
        // 단어 N개를 입력받아 그룹 단어의 개수를 출력하는 프로그램 작성

        //기존에 나왔던 단어가 한번 더 반복된다면 그룹단어아님
        //그 대신 한 문자 뛰어서 나온 경우만
        //brute forcing으로 다 검사하는건 어떰
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String[] arr = new String[N];

        scanner.nextLine();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }

        String voca = "";
        int count = N;
        for (int i = 0; i < arr.length; i++) {
            voca = arr[i];
            outer :
            for (int j = 0; j < voca.length() - 1; j++) {
                for (int k = j + 1; k < voca.length(); k++) {
                    if (j + 1 >= voca.length())
                        break outer;
                    if (voca.charAt(j) != voca.charAt(j + 1) && voca.charAt(j) == voca.charAt(k)) {
                        count--;
                        break outer;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
