import java.util.Scanner;

public class 9_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}


// Python Code
// a,b = input().split()
// a = int(a)
// b = int(b)
// print(a+b, a-b, a*b, int(a/b), a%b, sep = "\n")
