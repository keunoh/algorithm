package step2;

import java.util.Scanner;

public class Back25314 {
    public static void main(String[] args) {
        //1. 4의 배수의 정수가 주어진다.
        //2. long 마다 4바이트 정수저장.
        //3. 주어진 수의 4로 나눈 갯수만큼 long을 더해 String 완성

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int mokOfN = N / 4;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mokOfN; i++) {
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb);

    }
}
