import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int spell[][] = new int[num][2];
        int rank[] = new int[num];

        for (int i = 0; i < num; i++) {
            rank[i] = 1;
            spell[i][0] = sc.nextInt();
            spell[i][1] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (spell[i][0] > spell[j][0] && spell[i][1] > spell[j][1]) {
                    rank[j]++;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}

// Python Code

// N = int(input())

// people = []
// for _ in range(N):
// w, h = map(int, input().split())
// people.append((w, h))

// for c in people :
// rank = 1

// for n in people:
// if (c[0]!=n[0]) & (c[1]!=n[1]):
// if (c[0]<n[0]) & (c[1]<n[1]):
// rank += 1

// print(rank)