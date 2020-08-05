import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }

        sc.close();
    }
}

// Python Code

// ab = int(input())

// for i in range(ab):
// a, b = input().split()
// print(int(a)+int(b))