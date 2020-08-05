import java.util.*;

public class Algo11720 {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		// 한번의 Scanner로 한번은 int로, 한번은 String으로 받는다.  
		int num = sc.nextInt();
		String a = sc.next();

		int sum = 0;
        
		for(int i = 0; i < num; i++) {
			sum += a.charAt(i)-48; // charAt은 아스키코드로 받는다. 추가적으로 '0'아니면 -48해야 원래 값이 나온다. 
		}
		System.out.print(sum);
	}

}




// 지금 상태로는 0이 있으면 오류가 뜬다. 
/*
  public class Algo11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		int sum = sc2.nextInt();
		
		int result = 0;
		while(num != 0) {
			result += sum%10;
			sum /= 10;
			num--;
		}
		System.out.print(result);
	}

}
*/
