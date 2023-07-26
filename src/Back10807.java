import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10807 {
    public static void main(String[] args) throws IOException {
        /**
         * 1. 문제를 읽고 이해한다.
         * 2. 문제를 익숙한 용어로 재정의한다.
         * 3. 어떻게 해결할지 계획을 세운다.
         * 4. 계획을 검증한다.
         * 5. 프로그램으로 구현한다.
         * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
         */
        //Q. 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
        //1. 일단 숫자를 하나 받자, 그 다음에 그 수만큼 for문을 반복해 정수를 담아주자.
        //2. 그리고 새롭게 입력받은 값(V)을 이용해서 몇 개가 존재하는지 카운트를 세서 반환하자. 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int V = Integer.parseInt(br.readLine());
        int count = 0;

        for (int value : arr) {
            if (value == V)
                count++;
        }

        System.out.println(count);
        
    }
}
