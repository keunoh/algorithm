package step2;

import java.util.Scanner;

public class Back10101 {
    public static void main(String[] args) {
        // Q. 삼각형의 세각을 입력 받고
        // 세각 크기 모두 60 : Equilateral
        // 세각합이 180이고, 두각이 같으면 : Isosceles
        // 세각합이 180이고, 같은 각이 없다면 : Scalene
        // 세각합이 180이 아니면 Error
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 간단하게 if else
        if (A + B + C != 180) {
            System.out.println("Error");
        } else {
            if (A == B && B == C) {
                System.out.println("Equilateral");
            } else if (A == B && A != C) {
                System.out.println("Isosceles");
            } else if (A == C && A != B) {
                System.out.println("Isosceles");
            } else if (B == C && A != B) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
