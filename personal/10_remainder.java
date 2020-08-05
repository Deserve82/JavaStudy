import java.util.*;

public class 10_remainder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        
        System.out.println((A+B)%C);
        System.out.println((A%C + B%C)%C);
        System.out.println((A*B)%C);
        System.out.println((A%C * B%C)%C);
    }
}

// Python Code

// a, b, c = input().split()
// a = int(a)
// b = int(b)
// c = int(c)
// print((a+b)%c)
// print((a%c + b%c)%c)
// print((a*b)%c)
// print((a%c * b%c)%c)