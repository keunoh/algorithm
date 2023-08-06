import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back9063 {
    /**
     * 1. 문제를 읽고 이해한다.
     * 2. 문제를 익숙한 용어로 재정의한다.
     * 3. 어떻게 해결할지 계획을 세운다.
     * 4. 계획을 검증한다.
     * 5. 프로그램으로 구현한다.
     * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
     */
    public static void main(String[] args) throws IOException {
        // Q. N개의 옥구슬이 주어진다. N 개의 점을 둘러싸는 최소 크기의 직사각형 넓이 출력
        // 주어진 옥구슬의 x좌표는 최소값을 기준으로 잡으면 될거 같다.
        // 그리고 최대값과 - 해주어서 구하면 될 듯 하다.
        // y도 마찬가지 아닐까?

        // x 좌표 값이 들어오면 최대값과 최소값을 구해주자

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int x = 0, y = 0;
        int minX = 0, maxX = 0;
        int minY = 0, maxY = 0;

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                st = new StringTokenizer(br.readLine(), " ");
                x = minX = maxX = Integer.parseInt(st.nextToken());
                y = minY = maxY = Integer.parseInt(st.nextToken());
                if (N == 1) break;
            } else {
                st = new StringTokenizer(br.readLine(), " ");
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());

                if (x < minX) minX = x;
                if (x > maxX) maxX = x;
                if (y < minY) minY = y;
                if (y > maxY) maxY = y;
            }
        }
        if (minX < 0 && minY >= 0) {
            System.out.println((maxX + -minX) * (maxY - minY));
        } else if(minX >= 0 && minY >= 0) {
            System.out.println((maxX - minX) * (maxY - minY));
        } else if (minX < 0 && minY < 0) {
            System.out.println((maxX + -minX) * (maxY + -minY));
        } else if (minX >= 0 && minY < 0) {
            System.out.println((maxX - minX) * (maxY + -minY));
        }
    }
}
