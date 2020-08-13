import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gugu = scan.nextInt();
        scan.close();

        for (int i = 1; i < 10; ++i) {
            System.out.println(gugu + " * " + i + " = " + (gugu * i));
        }
    }

}

// Python code

// gugu = int(input())
// for i in range(1, 10):
// print(gugu, "*", i, "=", gugu*i)