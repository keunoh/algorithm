package step2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Back9506 {
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
        // Q. 어떤 숫자 n이 자신을 제외한 모든 약수들의 합이면
        // 완전수라고함
        // n이 완전수인지 아닌지 판단하는 프로그램
        // 입력 마지막엔 -1이 주어짐

        int n;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            n = scanner.nextInt();
            int sum = 1;
            if (n == -1) break;

            List<Integer> list = new ArrayList<>();
            list.add(1);
            // 숫자를 받고 약수를 구하자
            for (int i = 2; i <= n ; i++) {
                if (n % i == 0 && n != i) {
                    list.add(i);
                    sum += i;
                }
            }

            if (n == sum) {
                StringBuilder sb = new StringBuilder();
                sb.append(n + " = 1 + ");
                for (int i = 1; i < list.size(); i++) {
                    if (i == list.size() - 1)
                        sb.append(list.get(i));
                    else
                        sb.append(list.get(i) + " + ");
                }
                System.out.println(sb.toString());
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }

    }
}
