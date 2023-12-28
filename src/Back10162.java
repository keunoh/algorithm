import java.util.Scanner;

public class Back10162 {
    /** 3개의 버튼 A, B, C : 5분, 1분, 10초
     *  요리해야할 시간 T초 -> A, B, C 버튼을 적절히 눌러 그 시간의 합이 T초가 되도록
     *  단, 버튼 횟수는 최소
     * */
    static int[] arr = new int[3];
    public static void main(String[] args) {
        // A : 300초, B : 60초, C : 10초
        // 최소가 되게 하려면 가장 소비시간이 큰 버튼 부터 누르는게 좋을 듯
        Scanner scanner = new Scanner(System.in);
        int A = 300;
        int B = 60;
        int C = 10;

        int T = scanner.nextInt();

        while (T / A > 0) {
            T = T - A;
            arr[0]++;
        }

        while (T / B > 0) {
            T = T - B;
            arr[1]++;
        }

        while (T / C > 0) {
            T = T - C;
            arr[2]++;
        }

        if (T == 0) {
            System.out.printf(arr[0] + " " + arr[1] + " " + arr[2]);
        } else {
            System.out.println(-1);
        }

        scanner.close();

    }
}
