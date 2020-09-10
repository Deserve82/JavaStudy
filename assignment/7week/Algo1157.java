import java.util.Scanner;

public class Algo1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toUpperCase();
		int [] alba = new int[26];
		int max = 0;
		char result = ' ';
		
		for(int i=0;i<word.length();i++) {
			alba[word.charAt(i)-65]++;
			if(alba[word.charAt(i)-65] > max) {
				result = word.charAt(i);
				max = alba[word.charAt(i)-65];
			}else if (alba[word.charAt(i)-65] == max) {
				result = '?';
			}
		}
		System.out.print(result);
		
	}

}


// ���ڿ��� �̸����� ����ؾ��Ѵ�. 
// �ϴ� ������ ����. �ܾ �����ָ� ���� ���� ���� �ܾ ����ϸ� �Ǵ� ���̴�. (�����ϴ� ���� ��ƴ�.)
// �ϴ� ���� �� ���ε�, �� ���� ����� �˰� �ٽ� �����ϴ� ����. 

/* 
 1. �ϴ� �ܾ �޾ƾ��Ѵ�. 
 2. ���ĺ� ũ�⸸ŭ�� �迭�� �����, �ϴ� ���� �ܾ�.length()��ŭ for���� ������. 
 3. �ܾ��� ���� ����(���� ��� A�� ù���� �̷�������)�� ���Ѵ�. 
  
  
  ! ��� �� .toUpperCase() ��� ���ĺ��� �빮�ڷ� �ٲ��ش�. 
  */
