import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; ++i) {
            System.out.println(i);
        }
    }
}

// 증감연산자
// https://iwantadmin.tistory.com/114

// Python Code
// n = int(input())

// for i in range(n):
// print(i+1)