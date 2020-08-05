import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        System.out.println(A * (B % 10));
        System.out.println(A * (B % 100 / 10));
        System.out.println(A * (B / 100));
        System.out.println(A * B);
    }

}

// + Python Code

// num1 = int(input())
// num2 = input()

// for i in range(0, 3):
// result = num1 * int(num2[2-i])
// print(result)

// print(num1 * int(num2))