import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int M = in.nextInt();
        in.close();

        if (M < 45) {
            H--;
            M = 60 - (45 - M);
            if (H < 0) {
                H = 23;
            }

            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}

// Python Code

// hour,minute = map(int, input().split())

// if minute > 44:
// print(hour, minute-45)
// elif minute <= 44 and hour >= 1:
// print(hour-1, minute+15)
// else:
// print(23, minute+15)
