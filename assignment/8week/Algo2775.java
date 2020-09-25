import java.util.Scanner;

public class Algo2775 {

	public static int floor_people(int floor, int roomNum) {
		if(floor == 0) {
			return roomNum;
		} else if (roomNum ==1) {
			return 1;
		} else {
			return floor_people(floor-1,roomNum)+floor_people(floor,roomNum-1);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		
		for(int i=0;i<roop;i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();			
			System.out.print(floor_people(k,n)+ "\n");
		}
	}
	
	
}


// k�� n�� �Ѵ� 1���� 14���� 
// ��� �ݺ��� �ؾ��Ѵ�. 1ȣ�̸� ������ 1�� ����ؾ��Ѵ�. 
// ���� �ݺ��Ǵ� ���� ���⿡ ���(Recursive)�� Ǯ����� �� ������ ��� ������� �� �𸣰ڴ�. 
// �̰� �ϴ� ã�� ��Ģ�� k�� nȣ �ִٰ� �ϸ� 
// k-1�� nȣ�� k�� n-1ȣ�� ���ϴ� ���� ���̴� 