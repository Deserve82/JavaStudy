import java.util.Scanner;


public class Algo2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int result = 1;
		int room = 1;
		int add_room = 6;
		
		while(true) {
			if(num <=room) {
				break;
			}
			
			room = room + add_room;
			add_room += 6;
			result++;
		}
		
		System.out.print(result);

	}

}


// ���й������ �ϸ� �ݹ� Ǫ�� �����ε� 
// 1�� ���ķ� 6 12 18 24 �̷� ������ 6�� ��� ��ŭ �þ��. 
// 1 / 1+6 / 1+6+12 / 1+6+12+18 .... �̷� ���ε� ��ǻ�Ϳ��� �̰� � ������ �����ؾ��ϳ�??


// 1�� ����, 6�� ������ 0/1/1+2/1+2+3 �̷����ε� �̰� ������� �������Ѿ����� ���ڴ�. 
// ����.. 1�ð����� ����ϰ� ��ã�ھ ���� �ϳ� �ôµ� �ʹ� �����̼��̴�. 

