import java.util.Scanner;

public class Algo2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i=0; i<input;i++) {
			int number =sc.nextInt();
			String word = sc.next();
			String result ="";
			
			for(int j=0;j<word.length();j++) {
				for(int k=0; k<number;k++) {
					result = result + word.charAt(j);
				}
			}
			System.out.println(result);
		}
	}

}

// �ϴ� ó������ input���� ����� ���� ���� ���Ѵ�. 
// �� �Ŀ� ���������� 1. ����ݺ��Ұ��� 2. � �ܾ �ݺ��Ұ��� �̴�. 