package step2;

import java.util.Scanner;

public class Back24313 {
    /**
     * 수식 f(n) = (a1)n + a2 (a1, a2는 주어진다.)
     * f(n) <= c * g(n) (c는 주어지고, O(n)을 구하라 했으므로 g(n) == n)
     * n >= n0 (n0는 주어진다)
     * @param args
     */
    public static void main(String[] args) {
        //위 식을 만족하면 1, 아니면 0
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        int result = fn(a1, a2, n0) <= gn(c, n0) && (c >= a1) ? 1 : 0;
        System.out.println(result);
    }

    static int fn(int a1, int a2, int n) {
        return a1 * n + a2;
    }

    static int gn(int c, int n) {
        return c * n;
    }
}
