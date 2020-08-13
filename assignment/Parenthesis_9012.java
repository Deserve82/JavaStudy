package BaekJoon.week3;
/*
    - 괄호가 열고 닫힘이 이루어져야 YES, 그렇지 못하면 NO
        - 접합(concatenate)가 가능함. "()(())", "((()))()"
        - 불완전한 괄호는 NO
    - 입력: T와 문자열(2보다 길거나 같고 50보다 적거나 같음)
        - T번 반복(제한없는 양의 정수), 각 행마다 YES/NO를 출력해줘야함
    - 출력: YES/NO
 */
/*
    - 짝수로 접근. 각 문장마다 split으로 구분
    - 반복문 돌면서 "("와 ")"를 int cnt++;
    - 열고 닫는 괄호 갯수 모두 짝수여야 YES 반환, 아니면 NO
     > 예외 발생: ()(()())
     > 규칙 추가: 절반으로 나눴을 때 양쪽의 open & close 개수가 같으면 된다.
    - 한 문장 끝나고 Array 리셋필요
    - GG...

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Parenthesis_9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        //괄호 열고 닫힘 갯수 count 변수 선언
        int openCnt = 0;
        int closeCnt = 0;

        for (int i = 0; i < t; i++) {

            String ps = br.readLine();
            String[] psArr = ps.split("");
            int length = psArr.length;
            System.out.println(Arrays.toString(psArr));


            for (int j = 0; j < (length / 2); j++) {
                if (psArr[j].equals("(")) {
                    openCnt++;
                }
            }
            for (int k = (length / 2); k < length; k++) {
                if (psArr[k].equals(")")) {
                    closeCnt++;
                }
            }



            System.out.println(openCnt);
            System.out.println(closeCnt);

                if (openCnt == closeCnt && length % 2 == 0 && openCnt >= closeCnt) {
                    if (psArr[0].equals("(") && psArr[length - 1].equals(")")) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
                openCnt = 0;
                closeCnt = 0;
                psArr = null;
        }

    }

}
