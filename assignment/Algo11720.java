import java.util.*;

public class Algo11720 {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		// �ѹ��� Scanner�� �ѹ��� int��, �ѹ��� String���� �޴´�.  
		int num = sc.nextInt();
		String a = sc.next();

		int sum = 0;
        
		for(int i = 0; i < num; i++) {
			sum += a.charAt(i)-48; // charAt�� �ƽ�Ű�ڵ�� �޴´�. �߰������� '0'�ƴϸ� -48�ؾ� ���� ���� ���´�. 
		}
		System.out.print(sum);
	}

}




// ���� ���·δ� 0�� ������ ������ ���. 
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
