import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();

        if (score >= 90) {
            System.out.println('A');
        } else if (score >= 80) {
            System.out.println('B');
        } else if (score >= 70) {
            System.out.println('C');
        } else if (score >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}

// Python Code

// a = int(input())

// if a >= 90:
// print("A")
// elif a >= 80:
// print("B")
// elif a >= 70:
// print("C")
// elif a >= 60:
// print("D")
// else:
// print("F")
