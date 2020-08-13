package BaekJoon.week3;
/*
    준규는 숫자카드 N장 소유. 수는 절대값 2의 62승 보다 크거나 같음(음수 포함)
    N은 1보다 크고 100,000보다 작거나 같다
    준규가 가진 카드중 가장 많은 정수를 구하시오
    가장 많이 가진 정수가 여러개라면, 작은 것을 출력한다.
    - 입력: 받을 숫자 N과 해당되는 숫자들
    - 출력: 가장 많이 가지고 있는 정수를 구하시오.
 */
/*
    숫자가 2의 26승 이기 때문에 long을 써줘야한다.
     - 데이터 타입 단위: long(2^62) > int(2^32) > short(2^16) > byte(2^8)
     1. 배열에 받아야한다. '통계' 문제에서 썼던 배열 index 이용하는 최빈값 방법은 숫자가 너무 커서 안될듯
      > 배열을 2개 만든다. 중복 count를 위한 배열1, 숫자를 담는 배열2. 중복 count 배열을 sort한다. ..-너무 복잡-
     2. list를 이용해 배열 index 이용하면 될듯! -> index 초기화 할 수 없으니 그 방법은 못씀
     3. 2차원 배열? 2차원에는 count를 넣는다. long[n][2] 으로 선언. long[n][1] 은 숫자값, long[n][2]는 중복갯수
      > 시간초과..
      >> 2차원 배열 추가(n^2)와 2차원 배열 정렬에서 초과된듯(n-1)+(n-2)+...0)..
 */

import java.util.*;

public class Card_11652 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //준규가 소유한 카드 개수 설정
        int n = sc.nextInt();
        //카드 숫자 담을 list 선언
        //List<Long> numList = new ArrayList<>();
        //카드 받을 반복문 생성
//        for(int i = 0; i < n; i++) {
//            Long num = sc.nextLong();
//            numList.add(num);
//        }

        //3번 풀이 - 2차원 배열
        Long[][] numArr = new Long[n][2];
        //1차원에 숫자 입력
        for(int i = 0; i < n; i++) {
            numArr[i][0] = sc.nextLong();
        }

        for(int j = 0; j < n; j++) {
            long cnt = 0;
                for(int k = 0; k < n; k++) {
                    if(numArr[j][0] == numArr[k][0]) {
                        cnt++;
                        numArr[j][1] = cnt;
                    }
                }
        }

        //2차원 배열 블로그 참조 - comparator 원리 이해못하겠음
        Arrays.sort(numArr, new Comparator<Long[]>() {
            @Override
            public int compare(Long[] numArr1, Long[] numArr2) {
                Long t1 = numArr1[1];
                Long t2 = numArr2[1];
                return Long.compare(t2, t1);
            }
        });
        //2차원 배열 sort 마침, 그 다음으론 [1][1]과 같은 [n][1] 1차원 숫자들만 모두 배열에 담은 다음 sort해서 맨 앞에 있는 숫자 뽑자
        List<Long> sortList = new ArrayList<>();
        for(int z = 0; z < n; z++) {
            if(numArr[z][1] == numArr[0][1]) {
                sortList.add(numArr[z][0]);
            }
        }

        Collections.sort(sortList);

        System.out.println(sortList.get(0));





   }
}
