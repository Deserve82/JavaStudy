import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String[] temp = br.readLine().split(" ");
                bw.write(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]) + "\n");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 입출력 방식이 느리면 여러 줄 입력 받거나 출력 시 시간 초과 날 수 있음
// Scanner와 System.out.println대신 BufferedReader, BufferedWriter를 사용할 수 있다.

// Python Code
// Python의 경우 Input대신 sys.stdin.readline을 사용

// import sys

// inp = int(input())
// for i in range(inp):
// a, b = map(int, sys.stdin.readline().split())
// print(a+b)