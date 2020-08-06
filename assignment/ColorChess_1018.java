package BaekJoon.week2;
/*
    - 체스판은 BWBW 검정 하얀색이 교대로 칠해져야 한다.
    - 주어진 체스판은 BWBWBW 형태로 생겼다.
    - 8*8 체스판을 만들어야 하는데 색을 다시 칠해야하는 최소 칸의 개수를 출력.
        - 입력: (8 <= N,M <= 50), 1~N행에는 M개의 칸 색이 입력된다.
        - 출력: 색칠 해야하는 최소 칸의 개수
 */
/*
    - 2차원 배열? index 1에 1행, 2에 2행 내용물....
    - 8*8은 아무렇게나 잘라도 된다?
    - 그럼 1행 1번부터 시작해도되나 무조건? 색은 어떻게 결정해야되지.
    - 모르겠다,.

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColorChess_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N, M 초기화 선언
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);


        //브루트포스로 비교할 기준 색깔판
        String bf = "BWBWBWBW";
        String wf = "WBWBWBWB";
        //검은색이 먼저인 판, 흰색이 먼저인 판
        char[][] bPan = new char[8][8];
        char[][] wPan = new char[8][8];
        
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 7; j++) {
                if(i % 2 == 0) {
                    bPan[i] = bf.toCharArray();
                    wPan[i] = wf.toCharArray();
                } else {
                    bPan[i] = wf.toCharArray();
                    wPan[i] = bf.toCharArray();
                }
            }
        }

        //사용자가 입력할 색깔판
        char[][] color = new char[n][m];

        //2차원 배열에 색깔 입력
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            color[i] = input.toCharArray(); //문자열을 char 배열로 변환해줌
        }

        if(color[0][0] == 'B') {

        } else {

        }







        
    }
    
}
