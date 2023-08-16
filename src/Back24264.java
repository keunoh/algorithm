import java.util.Scanner;

public class Back24264 {
    public static void main(String[] args) {
        // 첫째 줄에 입력의 크기가 (1 <= n <= 500,000)이 주어지는데
        // n*n을 했을 때 int로는 overflow가 발생할 수 있음
        // long으로 받아줘야함

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(n * n);
        System.out.println(2);
    }
}
