import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int score[] = new int[5]; // 학생들 점수를 배열에 저장
        int total = 0; // 점수의 총 합

        for (int i = 0; i < score.length; ++i) {
            score[i] = scan.nextInt(); // int값 정의?
            if (score[i] < 40) {
                score[i] = 40; // for문 반복 시 예외 규정
            }
            total += score[i]; // 반복한 for문값 total에 저장?
        }
        System.out.println(total / 5);

    }
}


// 배열 복습

// Python Code
// a = [0]*5

// for i in range(5):
// a[i] = int(input())

// if a[i] < 40:
// a[i] = 40

// total = sum(a)/5
// print(int(total))