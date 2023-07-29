import java.util.Scanner;

public class Back2869 {
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
        //Q. 달팽이가 높이 V미터인 나무막대를 올라감
        //낮에 A미터 올라갈 수 있다. 밤에는 B미터 미끄러진다.
        //정상에 올라가면 미끄러지지 않는다.
        //달팽이가 나무막대를 모두 올라가려면 며칠이 걸리는가?
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();  //2미터 올라감
        int B = scanner.nextInt();  //1미터 내려감
        int V = scanner.nextInt();  //꼭대기 5미터
        int days = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0)
            days++;

        // 정상에 올라간 후에는 미끄러지지 않는다.. 이 조건을 어떻게 활용하지?
        // while 문으로 하면 오래 걸리니 차이로 계산해주는구나
        System.out.println(days);

    }
}
