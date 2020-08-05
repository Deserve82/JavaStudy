import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputs[] = new int[8];
        int cnt = 0;
        String a = "";
        for (int i = 0; i < 8; i++) {
            inputs[i] = sc.nextInt();
        }
        for (int i = 0; i < inputs.length - 1; i++) {
            if (inputs[i + 1] == inputs[i] + 1) {
                a = "ascending";
            }

            // for이 2개..?
            else if (inputs[i + 1] == input[i] - 1) {
                a = "descending";
            } else {
                a = "mixed";
                break;
            }
        }
        System.out.println(a);
    }
}

// Python Code

// a = list(map(int, input().split())

// if a == sorted(a):
// print('ascending')
// elif a == sorted(a, reverse=True):
// print('descending')
// else:
// print('mixed')

// // 디폴트는 오름차순 정렬. 내림차순 정렬 시 sorted(list, reverse=True)