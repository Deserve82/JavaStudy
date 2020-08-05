
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = n; i > 0; --i) {
            System.out.println(i);
        }
    }
}

// Python Code
// a = int(input())
// for i in range(a, 0, -1):

// //인자값(초기값)a, 종료값은 해당값을 포함하지 않으므로 0, 증가값-1
// print(i)