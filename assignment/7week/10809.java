import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		for (char c = 'a' ; c <= 'z' ; c ++) {
			System.out.println(input.indexOf(c) + "");
		}
		
}
}
	
	
	// 입력받은 알파벳 -> 아스키코드를 통해 숫자로 변경 -> 배열에 저장
	// 알파벳이 단어에 포함되어 있지 않으면 -1 
	
	
	
	
	