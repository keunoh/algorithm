package recursive;

import java.util.Scanner;

public class Back2851 {
    // 문제 : 주어진 정수 10개(입력)들을 순서대로 합했을 때 100에 가깝게 만들고 싶다.
    // 중간에 합을 멈춘다면 그 이후의 합은 적용되지 않게 해야한다.
    // 목표 : 정수 누적합을 100에 가깝게 하라.
    // 조건 : 1. 버섯의 값은 0 < value <= 100
    //       2. 만약 100에 가까운 수가 2개라면 큰 값을 선택한다. (ex. 98, 102) => 102 선택
    public static void main(String[] args) {
        // 계획 : 누적값을 구한다. 100에 가깝다는 것을 어떻게 표현할 수 있을까?
        // 누적값이 100을 넘어서는 순간 판단하면 될 것 같다.
        // 100을 넘었을 때까지의 누적합과 바로 그 이전까지의 누적값을 비교해서
        // 100에 가까운 숫자를 찾아낸다.
        Scanner sc = new Scanner(System.in);
        int[] mushrooms = new int[10];

        for (int i = 0; i < mushrooms.length; i++) {
            mushrooms[i] = sc.nextInt();
        }

        near100Sum(mushrooms);
    }

    static void near100Sum(int[] mushrooms) {
        // 초기합, 목표점수
        int sum = 0;
        int goalPoint = 100;

        for (int i = 0; i < mushrooms.length; i++) {
            sum += mushrooms[i];
            if (sum >= goalPoint) {
                // 현재까지 누적값 = sum
                // 그 이전까지 누적값 sum - mushrooms[i]
                if (Math.abs(sum - goalPoint) > Math.abs(sum - mushrooms[i] - goalPoint)) {
                    System.out.println(sum - mushrooms[i]);
                } else {
                    System.out.println(sum);
                }
                break;
            } else if (sum < goalPoint && i == 9) {
                System.out.println(sum);
            }
        }
    }
}
