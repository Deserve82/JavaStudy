import java.util.Scanner;

public class Algo10809_diff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		for (int i=97; i<123;i++) {
			int cnt = 0;
			char order = (char) i;
			//System.out.println(order);
			for(int j=0; j<word.length();j++) {
				if(word.charAt(j)==order) {
					cnt++;
				}
			}System.out.print(cnt);
		}

	}

}

//String a = sc.next();
//int asci = a.charAt(0);

// ���� Ǯ���� ������ ����ϴ�. Algo2557
// � �ܾ �����Ǹ� A~Z���� �����Ͽ� ��� ���Ǿ��ִ� �� ����ϴ� �����̴�. 
// A~Z������ 26���� �����Ѵ�. 

// 2557�� �����ؼ��ϸ� for�� �ΰ��� �߾��µ� 
// 