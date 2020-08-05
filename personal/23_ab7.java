// 1. BufferedReader를 쓰는 방식
//  readLine()은 한 행을 전부 읽기 때문에 공백단위로 입력해 준 문자열을 공백단위로 분리해주어야 함
//  문자열 분리는 StringTokenizer
//  자료형 타입은 Integer.ParseInt()로 int형 변환
// 2. 또는 StringBuilder로 변경하여 쓰는 방식
//  출력 문자에 여러 타입이 섞여있으면 해당 메소드는 일일이 타입검사를 해주어야 하므로 시간이 더 걸림
// 3. BufferedWriter를 쓰는 방식
// 단독으로 int형 값만 넣을 경우 아스키 코드 값으로 인식됨
// 반드시 문자열과 int형을 함께 넣어줘야 int값을 제대로 출력할 수 있다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 1; i <= a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write("Case #" + i + ": ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}

// Python Code

// cases = int(input())

// for i in range(cases):
// a, b = map(int, input().split())
// ans = a+b
// print("Case #%s: %s" %(i+1, ans ))