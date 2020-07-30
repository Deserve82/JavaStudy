import java.util.Scanner;

public class Main {
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    };

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.close();
        System.out.println(Fibonacci(a));
    }
}

// public class Main {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int num = input.nextInt();
// System.out.println(fibonacci(num));
// }
// private static int fibonacci(int num) {
// if(num >= 2) return fibonacci(num - 1) + fibonacci(num - 2);
// else return num;
// }
// }

// Dynamic Programming

// public class Main {
// static long[] memo;

// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);

// memo = new long[91];

// input n = intput.nextInt();

// System.out.println(fibonacci(n));
// }

// private static long fibonacci(int n) {
// if(n <= 1) return n;
// else {
// if(memo[n] > 0) return memo[n];
// else memo[n] = fibonacci(n-1) + fibonacci(n-2);
// return memo[n];
// }
// }
// }

// + Python Code

// def fibonacci(num):
// if num <= 1:
// return num
// return fibonacci(num-1)+fibonacci(num-2)

// n=int(input())
// print(fibonacci(n))