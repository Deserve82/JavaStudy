import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer numA = new StringBuffer(sc.next());
		StringBuffer numB = new StringBuffer(sc.next());
		sc.close();
		
		int numIntegerA = Integer.parseInt(numA.reverse().toString());
		int numIntegerB = Integer.parseInt(numB.reverse().toString());
		
		if (numIntegerA > numIntegerB) {
			System.out.println(numIntegerA);
			
		}else {
			System.out.println(numIntegerB);
		}
	}
}


// StringBuffer
// 문자열 추가, 변경할 때 
// 왜 StringBuffer로 받아야하지?
