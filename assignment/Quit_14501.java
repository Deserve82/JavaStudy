package baekJoon.week4;
/*
    N+1 일째 되는 날 퇴사하기 위해 N일까지 최대한 많은 상담을 하려한다.
    상담을 완료하는데 걸리는 기간 Ti, 받을 수 있는 금액 Pi.
    걸리는 기간과 금액을 고려해 최대 수익을 구하는 프로그램을 작성하시오
        - 입력: N, 1<= N <= 15
            둘째줄부터 Ti와 Pi가 공백으로 구분되어서 주어짐 1일부터 N일까지 순서대로
            1<= Ti <= 5, 1<= Pi <= 1000
        - 출력: 최대 이익
 */
/*
    서로 겹치지 않게 경우의 수를 돌려보면서 최대 수익을 찾는다.
    고려할 요소:
        1. 기간이 겹치지 않도록 하는 조건?
        2. 수익이 높도록 - Pi/Ti가 높은 것 우선순위
        3. 기간이 N일을 넘어설 수 없음 - Ti 값들을 더했을 때 N보다 작아야함


 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Quit_14501 {
    public static void main(String[] args) throws IOException {

        //GG
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        //n일 = day
//        int day = Integer.parseInt(br.readLine());
//        //profit 담을 변수선언
//        int profitSum = 0;
//        //2차원 배열 선언
//        int[][] argArr = new int[day][2];
//        //기간Ti와 Pi n번 반복 입력
//        for(int i = 0; i < day; i++) {
//            String[] arg = br.readLine().split(" ");
//            argArr[i][0] = Integer.parseInt(arg[0]);
//            argArr[i][1] = Integer.parseInt(arg[1]);
//        }
//
//
//        //조건1) 기간이 n일을 넘지 말아야 한다.
//        for(int j = 0; j < day; j++) {
//            //종료시간
//            int endDate = argArr[j][0] + j;
//            argArr[j][0] = endDate;
//        }
//        //종료시간 기준 오름차순 정렬
////        Arrays.sort(argArr, new Comparator<int[]>() {
////            @Override
////            public int compare(int[] o1, int[] o2) {
////                return o1[0] - o2[0];
////            }
////        });
//
//        for (int i = 0; i < day; i++) {
//            System.out.println(argArr[i][0] + " " + argArr[i][1]);
//        }
//
//        //조건2) 최대수익 구하자.
//        //중복되면 더 높은 값 선택
//        //종료시간 n일 넘는 값은 제거
//        for (int k = 0; k < day; k++) {
//
//
//
//        }
//
//        System.out.println(profitSum);
//
//
//
        //풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(br.readLine());

        int[] time = new int[day];
        int[] profit = new int[day];
        int[] profitMax = new int[day];
        int max = 0;
        String[] str;

        for(int i = 1; i <= day; i++) {
            str = br.readLine().split(" ");
            time[i] = Integer.parseInt(str[0]);
            profit[i] = Integer.parseInt(str[1]);
        }
        //입력부

        for(int j = 1; j <= day; j++) {
            int workingTime = j + time[j];

            if(workingTime <= day) {
                profitMax[j] = Math.max(profit[j] + profitMax[workingTime], profitMax[j+1]);
            } else {

            }
        }
        System.out.println(max);
    }
}
