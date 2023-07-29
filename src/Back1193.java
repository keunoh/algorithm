import java.util.Scanner;

public class Back1193 {
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
        // Q. 무한히 큰 배열
        // 나열된 분수들을 어떤 규칙에 의하여 순차적으로 나열할 때
        // X번째 분수를 구하는 프로그램을 작성하라

        // 1/1, 1/2, 2/1, 3/1, 2/2, 1/3, 1/4, 2/3 ...
        // 4번째 분수는 2/2
        // X를 입력하면 해당 분수가 나오도록

        //규칙을 찾아봐야함
        //1. 분자 분모 합이 2이라면 나오는 배열 갯수는 1개
            // 즉 a + b = 2   count = a + b - 1
        //2. 이동하면서 분자가 + 되면 분모는 -가 되고 그 반대도 같다.
            // 즉 합은 일정해야하는 것이다.
        //3. 다음 배열로 이동할 때, 어느 경우는 분자를 더해주고 어느 경우는 분모를 더하나?
            // 갯수가 모두 충족했을 때 분자가 큰가 분모가 큰가 비교해주면 될듯
            // 분자가 크다면 분자에 1을 더하고 새로운 배열 시작
            // 분모가 크다면 분모에 1을 더하고 새로운 배열 시작
        //갯수에 따라 배열이 생성되면 되겠다.
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int count = 0;
        int a = 1;
        int b = 1;
        int length = a - b + 1;

        String[] arr = new String[X];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + "/" + b;
            count++;
            if (length == count) {
                // 원하는 만큼 배열을 넣었다면 아래를 수행해준다.
                if (a > b) {
                    a += 1;
                    b = 1;  //초기화
                } else if (a < b) {
                    b += 1;
                    a = 1;
                } else {
                    b += 1;
                    a = 1;
                }
                length = a + b - 1; //길이 초기화
                count = 0;  //카운트초기화
            } else {
                if ((a + b) % 2 == 0) {
                    //분자 분모 합이 짝수면
                    a -= 1;
                    b += 1;
                } else {
                    a += 1;
                    b -= 1;
                }
            }
        }
        System.out.println(arr[arr.length - 1]);
    }
    //값은 정확히 나오지만 메모리 오류가 난다.
    //다시 문제 풀어야함 메모리가 적은 방향으로
}
