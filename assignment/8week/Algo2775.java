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


// k와 n을 둘다 1에서 14까지 
// 계속 반복을 해야한다. 1호이면 무조건 1을 출력해야한다. 
// 뭔가 반복되는 것이 많기에 재귀(Recursive)로 풀어야할 것 같은데 어디서 묶어야할 지 모르겠다. 
// 이게 일단 찾은 규칙은 k층 n호 있다고 하면 
// k-1층 n호와 k층 n-1호를 더하는 값이 값이다 