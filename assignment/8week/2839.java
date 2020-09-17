

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int count = 0;
        
        while(sugar % 5 !=0 && sugar > 0) {
        	sugar -= 3;
        	count ++;
        }
        if(sugar < 0) 
        	System.out.println(-1);
        else
        	System.out.println(count + sugar/5);
    }
}



//N kg 배달해야 하는 설탕
//설탕 3a + 5b = n
//최대한 적은 봉지
//정확하게 N kg안되면 -1 출력


//python

// sugar = int(input())
// count = 0
// while True:
//  if(sugar % 5) == 0;
//   count = count + (sugar // 5)
//   print (count)
//   break;
//  sugar = sugar-3
//  count += 1
//  if sugar < 0:
//   print("-1")
//   break;