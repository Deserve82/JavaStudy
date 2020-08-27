package baekJoon.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
    물 새는 곳 좌표가 주어지고 테이프 길이가 주어짐.
    테이프 사용을 최소화해서 누수를 막아라.
    ** '물을 막을 때 그 위치의 좌우 0.5만큼 간격을 줘야 물이 다시는 안샌다고 생각한다.' -> 되게 쉬운 뜻인데 좌우 0.5? 구멍 외 부분을 막으라는 건가?
    라고 생각해서 뭔말인가 싶었다. 블로그를 찾아보니 그냥 구멍이 좌,우가 0.5씩이라서 쉽게 말해 구멍을 완전히 막으려면 테이프 1 길이가 필요하다이다.
    일부러 저런 식으로 말을 쓴건가..
    - 입력: 첫 줄 - 물이 새는 곳의 개수 N과 테이프 길이 L이 주어짐
    - 출력: 필요한 테이프 개수
 */
public class RepairMan_1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int holes = Integer.parseInt(input1[0]);
        int tape = Integer.parseInt(input1[1]);

        //누수 위치 배열 선언
        int[] location = new int[holes];
        //구멍 간 거리 배열 선언
        int[] measure = new int[holes-1];
        //구멍 위치 선언
        String[] input2 = br.readLine().split(" ");
        for(int i = 0; i < holes; i++) {
            location[i] = Integer.parseInt(input2[i]);
        }
        //배열 오름차순 정렬
        Arrays.sort(location);
        //구멍 간 거리 배열 초기화
        for(int i = 1; i < holes; i++) {
            measure[i-1] = location[i] - location[i-1];
        }

        //테이프 간의 거리
        int distance = 0;
        //테이프 개수 총합
        int total = 1;
        //테이프 개수 출력
        for(int r : measure) {
            distance += r;
            if(distance > tape -1) {
                total ++;
                distance = 0;
            }
        }

        System.out.println(total);

    }
}
