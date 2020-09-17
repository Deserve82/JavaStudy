import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int staticCost = sc.nextInt();
        int cost = sc.nextInt();
        int price = sc.nextInt();
        int result;

        if(price <= cost) result = -1;
        else result = staticCost / (price - cost) + 1;
        System.out.println(result);
    }
}

//python

// 노트북 가격 - 가변비용 / 고정비용 + 1
//a, b, c = map(int, input().split())
//if b >= c:
//    print(-1)
//else:
//    print((a // (c - b)) + 1)