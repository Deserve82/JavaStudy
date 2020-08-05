import java.util.Scanner;

public class 7_ab {
    public class Main{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            scan.close();
            System.out.println(a*b);
        }
}

// + Python Code
// a, b = input().split()
// print(int(a) * int(b))