import java.util.Scanner;

public class Algo1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr =sc.nextLine().trim();
		int result = arr.split(" ").length;
		
		if(arr.isEmpty()) {
			System.out.print(0);
		}else
		System.out.print(result);
	}

}


// 내 생각에서는 단어만이라고 했으니까 뛰어쓰기로 해서 String을 Arr로 한다음
// Arr의 크기를 프린트하면 되는 쉬운 거라고 생각했는데 자꾸 이상한 답이 나오지? 
// ???? 왜 틀린 지 모르겠다. 

// 배운 것 ! .trim(); 앞 뒤에 공백을 잘라준다. 
// 틀린 이유 : 아무것도 없을 때 0이 프린트 되어야한다. 