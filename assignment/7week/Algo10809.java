import java.util.*;

public class Algo10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
	
		for(char i= 'a'; i<='z';i++) {
			System.out.print(word.indexOf(i)+ " ");
		}
	}

}


// ������ � ������ Ǯ����� �� �𸣰ڴ�. 
// �˾Ƴ� ��
// 1. for���� (���ڿ��̱⿡) char�� ���� �� �ִ�. 
// 2. ���ڿ��� indexOf��� �޼ҵ尡 �־���... ���� 
// ������ -1�� ���ش�. 