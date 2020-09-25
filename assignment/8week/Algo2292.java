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


// 수학문제라고 하면 금방 푸는 문제인데 
// 1번 이후로 6 12 18 24 이런 식으로 6의 배수 만큼 늘어난다. 
// 1 / 1+6 / 1+6+12 / 1+6+12+18 .... 이런 식인데 컴퓨터에선 이걸 어떤 식으로 구현해야하나??


// 1을 빼고, 6읋 나누면 0/1/1+2/1+2+3 이런식인데 이걸 어떤식으로 구현시켜야할지 몰겠다. 
// 세상에.. 1시간정도 고민하고 못찾겠어서 답을 하나 봤는데 너무 센세이션이다. 

