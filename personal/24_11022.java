public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loopNum = scan.nextlnt();
        int a, b;
        for (int i = 1; i <= loopNum; i++) {
            a = scan.nextlnt();
            b = scan.nextlnt();
            if (a > 0 && b < 10) {
                System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
            }

        }
    }
}

// python code

// cases = int(input())

// for i in range(cases):
// a, b = map(int, input().split())
// ans = a + b
// print("Case #%s: %s + %s = %s"%(i+1, a, b, ans ))