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


// 도저히 어떤 식으로 풀어야할 지 모르겠다. 
// 알아낸 것
// 1. for문에 (문자열이기에) char를 넣을 수 있다. 
// 2. 문자열에 indexOf라는 메소드가 있었다... 세상에 
// 심지어 -1도 해준다. 