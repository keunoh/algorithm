package step2;

import java.util.Scanner;

public class Back15894 {
    public static void main(String[] args) {
        // Q. 한변의 길이가 1인 정사각형.
        // 가장 아랫부분의 정사각형이 n개가 되었을때, 바깥 둘레길이 구하는 프로그램

        // 처음에 틀렸었는데 문제는 자료형의 크기가 문제에 주어진 자료형의 크기 보다 작은
        // int 형이 었기 때문 -> long 으로 바꿔주어야 한다.
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(4 * N);
    }
}
