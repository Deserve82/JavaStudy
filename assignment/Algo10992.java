import java.util.*;

public class Algo10992 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
			for(int j=1;j<num;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		
		for(int x=1;x<num-1;x++) {
			for(int y=num-x; y>1 ;y--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int z=1 ; z<=(2*x)-1  ; z++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
			
		for (int a=0; a<(num*2)-1;a++) {
			System.out.print("*");
		}
	}
}


// ���� ����
// 1. ���� Ʈ���� �����. 
// 2. Ʈ�� �ȿ� " "�� �� �� �ְ� �Ѵ�. 

// ���� ������ Ʋ���� �ϴ� ��������. ���ظ� �ϸ� 
// ���� ù�κа� �������κ��� ���� �������Ѵ�. 
// ���� �� �� �κ��� ���� ���� �ݺ��ؾ��Ѵ�. num�� �þ���ϰ�, " "�� num-2���� �پ�����ϰ�, ��� " "�� 1,3,5 Ȧ���� �þ���Ѵ�.  