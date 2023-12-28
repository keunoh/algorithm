package step2;

import java.util.Scanner;

public class Back5073 {
    public static void main(String[] args) {
        // Q. 세변의 길이가 모두 같은경우 : Equilateral
        // 두 변의 길이만 같은 경우 : Isosceles
        // 세 변의 길이가 모두 다른 경우 : Scalene

        int a, b, c;
        Scanner sc = new Scanner(System.in);
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) break;

            int max = 0;
            int A1 = 0;
            int A2 = 0;
            if (a >= b && a >= c) {
                max = a; A1 = b; A2 = c;
            }
            else if (b >= a && b >= c) {
                max = b; A1 = a; A2 = c;
            }
            else if (c >= a && c >= b) {
                max = c; A1 = a; A2 = b;
            }

            if (max >= A1 + A2) {
                System.out.println("Invalid");
            } else if (max == A1 && A1 == A2) {
                System.out.println("Equilateral");
            } else if (max == A1 || A1 == A2 || max == A2) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
