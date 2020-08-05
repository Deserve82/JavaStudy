// 1. ASCII CODE 활용 
// int형과 char형에 +또는 -연산자를 사용할 경우 char형이 int형으로 변환되어 계산
// 2. Integer클래스의 parseInt, String클래스의 substring 활용
// 입력값이 모두 숫자이므로 int형으로 강제 형변환하여 처리

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String inputs = sc.next();
        sc.close();

        int result = 0;
        for (int i = 0; i < n; ++i) {
            result += inputs.charAt(i) - '0'; // ???
        }
        System.out.println(result);
    }
}

// python code

// sum = 0
// inp = int(input())
// num = input()
// for each in num:
// sum += int(each)
// print(sum)