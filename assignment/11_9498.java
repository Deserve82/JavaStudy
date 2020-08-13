import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        sc.close();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}

// else if가 여러 개 반복되는 경우,
// 위쪽 if문 조건을 만족시키기 않을 경우에만 다음 조건 확인
// 따라서 아래와 같이 적을 필요 없음
// (score < 90 && score >= 80)

// Python Code

// score = int(input())
// if score >=90:
// print('A')
// elif score >= 80:
// print('B')
// elif score >= 70:
// print('C')
// elif score >= 60:
// print('D')
// else :
// print('F')
