package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back25206 {
    /**
     * 1. 문제를 읽고 이해한다.
     * 2. 문제를 익숙한 용어로 재정의한다.
     * 3. 어떻게 해결할지 계획을 세운다.
     * 4. 계획을 검증한다.
     * 5. 프로그램으로 구현한다.
     * 6. 어떻게 풀었는지 돌아보고, 개선할 방법이 있는지 찾아본다.
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //Q. 졸업하기 위해선 평점이 3.3이상이거나 졸업고사 통과
        // 졸업고사 시험 안 봄, 결국 평점이 3.3이상이어야함
        // 전공평점 = 전공과목별(학점 * 과목평점)의 합 / 학점 총합
        // P/F 과목 경우 등급이 P인 과목은 계산에서 제외
        // 전공평점 출력, 절대오차 or 상대오차 10(-4)이면 정답

        //조건 공백기준으로 3개의 값이 들어온다.
        //학점은 1.0, 2.0, 3.0, 4.0 중 하나임
        //등급도 ... 중 하나임
        //적어도 한 과목은 등급이 P가 아님이 보장됨

        // 전공평점 = 전공과목별의합 / 학점의 총합
        // 전공과목별(학점 * 과목평점)
        // sumOf전공과목별을 구하자
        // 학점의 총합을 구하자
        // P는 제외하자.
//        majorAverage = (myScore * majorScore) / sumScore;
        float majorAverage = 0;  //전공평점
        float myScore = 0;       //나의학점
        float majorScore = 0;    //과목평점
        float sumScore = 0;      //학점총합
        float sumEachMajorScore = 0; //전공과목별합

        //20줄에 걸쳐 데이터 입력 받음
        //20번 반복문에서 각각 전공과목별합과 학점을 더해주자.
        //마지막에 평점을 반환하자.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();

            //나의학점
            myScore = Float.parseFloat(st.nextToken());

            String grade = st.nextToken();
            //과목평점
            switch (grade) {
                case "A+":
                    majorScore = 4.5f;
                    break;
                case "A0":
                    majorScore = 4.0f;
                    break;
                case "B+":
                    majorScore = 3.5f;
                    break;
                case "B0":
                    majorScore = 3.0f;
                    break;
                case "C+":
                    majorScore = 2.5f;
                    break;
                case "C0":
                    majorScore = 2.0f;
                    break;
                case "D+":
                    majorScore = 1.5f;
                    break;
                case "D0":
                    majorScore = 1.0f;
                    break;
                case "F":
                    majorScore = 0.0f;
                    break;
            }

            if (!grade.equals("P")) {
                sumEachMajorScore += myScore * majorScore;
                sumScore += myScore;
            }
        }

        majorAverage = sumEachMajorScore / sumScore;
        System.out.printf("%.6f", majorAverage);
    }
}
