import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int Y = in.nextInt();

        if (X > 0) {
            if (Y > 0) {
                System.out.print(1);
            } else {
                System.out.print(4);
            }
        }

        else {
            if (Y > 0) {
                System.out.print(2);
            } else {
                System.out.print(3);
            }
        }
    }
}

// Python Code

// x = int(input())
// y = int(input())

// if x > 0:
// if y > 0:
// print(1)
// else:
// print(4)
// else:
// if y > 0:
// print(2)
// else:
// print(3)
// //